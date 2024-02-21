package com.sanha.localyum.controller

import com.sanha.localyum.dto.RestaurantRegisterRequest
import com.sanha.localyum.restaurant.application.port.`in`.RestaurantUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RestaurantController(
    private val restaurantUseCase: RestaurantUseCase,
) {
    @PostMapping("/restaurant")
    fun register(
        @RequestBody request: RestaurantRegisterRequest,
    ) {
        restaurantUseCase.register(request.toRestaurant())
    }
}
