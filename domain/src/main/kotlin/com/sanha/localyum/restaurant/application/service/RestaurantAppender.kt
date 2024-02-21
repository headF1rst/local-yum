package com.sanha.localyum.restaurant.application.service

import com.sanha.localyum.restaurant.application.port.out.RestaurantPort
import com.sanha.localyum.restaurant.domain.Restaurant
import org.springframework.stereotype.Component

@Component
class RestaurantAppender(
    private val restaurantPort: RestaurantPort,
) {
    fun register(restaurant: Restaurant) {
        restaurantPort.append(restaurant)
    }
}
