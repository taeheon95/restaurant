package com.taeheon.restaurant.store.dto

class StoreDto(
    var storeName: String,
    var address: String,
    var tableCount: Int,
    var openTime: String?,
    var closeTime: String?
)