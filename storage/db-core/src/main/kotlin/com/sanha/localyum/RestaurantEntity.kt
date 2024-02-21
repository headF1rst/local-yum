package com.sanha.localyum

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "restaurant")
class RestaurantEntity(
    id: UUID,
    val name: String,
): BaseEntity() {

    @Id
    var id: UUID = id
}
