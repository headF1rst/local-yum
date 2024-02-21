package com.sanha.localyum

import com.sanha.localyum.restaurant.application.port.out.RestaurantPort
import com.sanha.localyum.restaurant.domain.Restaurant
import org.springframework.stereotype.Repository

@Repository
class RestaurantAdapter(
    private val restaurantJpaRepository: RestaurantJpaRepository,
    private val restaurantMapper: RestaurantMapper,
): RestaurantPort {
    override fun append(restaurant: Restaurant) {
        restaurantJpaRepository.save(restaurantMapper.toEntity(restaurant))
    }
}
