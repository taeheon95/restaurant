package com.taeheon.restaurant.common.entity

import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity(
    val createdBy: Long,
    var updatedBy: Long,
    insertTimestamp: LocalDateTime = LocalDateTime.now(),
    updateTimestamp: LocalDateTime = LocalDateTime.now()
) : BaseTimeEntity(insertTimestamp, updateTimestamp)