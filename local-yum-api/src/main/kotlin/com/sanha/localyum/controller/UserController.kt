package com.sanha.localyum.controller

import com.sanha.localyum.support.response.ApiResponse
import com.sanha.localyum.user.application.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class UserController(
    val userService: UserService,
) {
    @GetMapping("/users/{userId}")
    fun findUser(
        @PathVariable userId: UUID
    ): ApiResponse<UserResponse> {
        val result = userService.read(userId)
        return ApiResponse.success(UserResponse.of(result))
    }
}
