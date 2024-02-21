package com.sanha.localyum.dto

import com.sanha.localyum.user.domain.User
import java.util.UUID

data class UserResponse(
    private var userId: UUID,
) {
    companion object {
        fun of(user: User): UserResponse {
            return UserResponse(
                userId = user.id,
            )
        }
    }
}
