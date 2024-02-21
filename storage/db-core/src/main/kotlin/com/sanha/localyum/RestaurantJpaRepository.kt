package com.sanha.localyum

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface  RestaurantJpaRepository: JpaRepository<RestaurantEntity, UUID>
