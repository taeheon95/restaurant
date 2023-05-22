package com.taeheon.restaurant.store.repository

import com.taeheon.restaurant.store.entity.StoreEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StoreRepository : JpaRepository<StoreEntity, Long> {
}