package com.sanha.localyum.restaurant.domain


data class Address(
    val street: String,
    val city: String,
    val state: String,
    val country: String,
    val postalCode: String,
    val detail: String? = null,
)
