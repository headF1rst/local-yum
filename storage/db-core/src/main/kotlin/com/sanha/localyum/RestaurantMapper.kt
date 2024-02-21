package com.sanha.localyum

import com.sanha.localyum.restaurant.domain.Restaurant
import org.springframework.stereotype.Component

@Component
class RestaurantMapper {

    fun toEntity(restaurant: Restaurant): RestaurantEntity {
        return RestaurantEntity(
            id = restaurant.id,
            name = restaurant.name,
        )
    }
}
