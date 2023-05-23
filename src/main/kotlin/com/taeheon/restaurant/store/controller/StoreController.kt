package com.taeheon.restaurant.store.controller

import com.taeheon.restaurant.store.service.StoreService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/store")
class StoreController(val storeService: StoreService) {

}