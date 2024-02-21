package com.sanha.localyum.user.application.port.`in`

import com.sanha.localyum.user.domain.User
import java.util.*

interface UserUseCase {
    fun read(id: UUID): User
}
