package com.sanha.localyum

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserJpaRepository: JpaRepository<UserEntity, UUID>
