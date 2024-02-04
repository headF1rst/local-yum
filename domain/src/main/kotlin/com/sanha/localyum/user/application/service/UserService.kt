package com.sanha.localyum.user.application.service

import com.sanha.localyum.user.UserReader
import com.sanha.localyum.user.domain.User
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(
    private val userReader: UserReader,
) {

    fun read(id: UUID): User {
        return userReader.read(id)
    }
}
