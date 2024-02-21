package com.sanha.localyum.user.application.service

import com.sanha.localyum.user.application.port.`in`.UserUseCase
import com.sanha.localyum.user.domain.User
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(
    private val userReader: UserReader,
): UserUseCase {

    override fun read(id: UUID): User {
        return userReader.read(id)
    }
}
