package com.majibu.chatai.domain.use_case.message

import com.majibu.chatai.domain.repository.PreferenceRepository
import javax.inject.Inject

class GetFreeMessageCountUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.getFreeMessageCount()
}