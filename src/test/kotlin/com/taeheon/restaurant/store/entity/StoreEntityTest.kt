package com.taeheon.restaurant.store.entity

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import org.slf4j.LoggerFactory

internal class StoreEntityTest : BehaviorSpec({
    val log = LoggerFactory.getLogger(this.javaClass)
    given("store entity test") {
        val store = StoreEntity(1L, "연산점", "부산시 연제구 묘봉산로 3", 10)
        `when`("개점 시간 설정 할 때 이상한 값을 할당하면") {
            then("IllegalArgumentException을 던진다.") {
                assertThrows<IllegalArgumentException> {
                    store.openTime = "12312412"
                }
            }
        }
        `when`("폐점 시간을 이상한 값으로 할당하면") {
            then("IllegalArgumentException을 던진다.") {
                assertThrows<IllegalArgumentException> {
                    store.closeTime = "123123"
                }
            }
        }
        `when`("운영 시간을 업데이트 하면") {
            then("IllegalArgumentException을 던진다.") {
                assertThrows<IllegalArgumentException> {
                    store.modifyStoreHours("00:00", "23:59")
                    store.modifyStoreHours("1111", "dasfas")
                }
            }
        }
    }
})
