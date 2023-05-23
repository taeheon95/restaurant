package com.taeheon.restaurant.common.util

import org.springframework.hateoas.EntityModel

class ApiResponse<T>(
    val resultCode: String,
    val resultMsg: String,
    data: T
) : EntityModel<T>(data)