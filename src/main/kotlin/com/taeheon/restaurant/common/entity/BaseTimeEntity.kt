package com.taeheon.restaurant.common.entity

import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseTimeEntity(
    @CreationTimestamp
    val insertTimestamp: LocalDateTime = LocalDateTime.now(),
    @UpdateTimestamp
    var updateTimestamp: LocalDateTime = LocalDateTime.now()
)