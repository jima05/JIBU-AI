package com.majibu.chatai.domain.use_case.upgrade

import com.majibu.chatai.domain.repository.PreferenceRepository
import javax.inject.Inject

class IsProVersionUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.isProVersion()
}