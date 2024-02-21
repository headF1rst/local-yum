package com.sanha.localyum.restaurant.domain

import java.util.UUID

data class Restaurant(
    val id: UUID = UUID.randomUUID(),
    var name: String,
    val category: Category,
    var address: Address,
    val link: Url,
)
