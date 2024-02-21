package com.sanha.localyum.restaurant.application.port.`in`

import com.sanha.localyum.restaurant.domain.Restaurant

interface RestaurantUseCase {

    fun register(restaurant: Restaurant)
}
