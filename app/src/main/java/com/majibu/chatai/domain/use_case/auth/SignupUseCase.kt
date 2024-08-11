package com.majibu.chatai.domain.use_case.auth

import com.majibu.chatai.domain.repository.AuthRepository
import javax.inject.Inject

class SignupUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String): Result<Unit> {
        return authRepository.signup(email, password)
    }
}
