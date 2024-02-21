package com.sanha.localyum.restaurant.application.port.out

import com.sanha.localyum.restaurant.domain.Restaurant

interface RestaurantPort {

    fun append(restaurant: Restaurant)
}
