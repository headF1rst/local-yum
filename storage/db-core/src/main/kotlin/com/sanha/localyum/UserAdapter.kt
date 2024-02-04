package com.sanha.localyum

import com.sanha.localyum.user.application.port.UserPort
import com.sanha.localyum.user.domain.User
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import java.util.*

@Repository
internal class UserAdapter(
    private val userJpaRepository: UserJpaRepository,
): UserPort {
    override fun read(id: UUID): User? {
        return userJpaRepository.findByIdOrNull(id)?.let {
            User(
                id = it.id!!,
            )
        }
    }
}
