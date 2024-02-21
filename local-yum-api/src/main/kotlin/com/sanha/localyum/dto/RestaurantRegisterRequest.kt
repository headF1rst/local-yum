package com.sanha.localyum.dto

import com.sanha.localyum.restaurant.domain.Restaurant

data class RestaurantRegisterRequest(
    val name: String,
    val category:
) {
    fun toRestaurant(): Restaurant {
        TODO("Not yet implemented")
    }
}
