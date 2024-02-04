package com.sanha.localyum.user.application.port

import com.sanha.localyum.user.domain.User
import java.util.UUID

interface UserPort {
    fun read(id: UUID): User?
}
