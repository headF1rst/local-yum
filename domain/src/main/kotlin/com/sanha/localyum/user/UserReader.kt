package com.sanha.localyum.user

import com.sanha.localyum.user.application.port.UserPort
import com.sanha.localyum.user.domain.User
import org.springframework.stereotype.Component
import java.util.NoSuchElementException
import java.util.UUID

@Component
class UserReader(
    private val userPot: UserPort,
) {
    fun read(id: UUID): User {
        return userPot.read(id) ?: throw NoSuchElementException()
    }
}
