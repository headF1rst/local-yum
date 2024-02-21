package com.sanha.localyum

import com.sanha.localyum.user.domain.NickName
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "user")
class UserEntity(
    val name: NickName,
): BaseEntity() {

    @Id
    val id: UUID? = null
}
