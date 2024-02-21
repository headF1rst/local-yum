package com.sanha.localyum.restaurant.application.service

import com.sanha.localyum.restaurant.application.port.`in`.RestaurantUseCase
import com.sanha.localyum.restaurant.domain.Restaurant
import org.springframework.stereotype.Service

@Service
class RestaurantService(
    private val restaurantAppender: RestaurantAppender,
): RestaurantUseCase {

    override fun register(restaurant: Restaurant) {
        restaurantAppender.register(restaurant)
    }
}
