package com.taeheon.restaurant.store.vo

import com.taeheon.restaurant.store.entity.StoreEntity

class StoreVo(entity: StoreEntity) {
    val id: Long
    val storeName: String
    val address: String
    val tableCount: Int
    val openTime: String?
    val closeTime: String?

    init {
        this.id = entity.id!!
        this.storeName = entity.storeName
        this.address = entity.address
        this.tableCount = entity.tableCount
        this.openTime = entity.openTime
        this.closeTime = entity.closeTime
    }
}