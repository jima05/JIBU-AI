package com.majibu.chatai.domain.use_case.upgrade

import com.majibu.chatai.domain.repository.PreferenceRepository
import javax.inject.Inject

class IsFirstTimeUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.isFirstTime()
}