package com.sanha.localyum

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class UserEntity(

): BaseEntity() {

    @Id
    val id: UUID? = null
}
