package com.majibu.chatai.domain.use_case.upgrade

import com.majibu.chatai.domain.repository.PreferenceRepository
import javax.inject.Inject

class SetProVersionUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke(isProVersion: Boolean) = preferenceRepository.setProVersion(isProVersion)
}
