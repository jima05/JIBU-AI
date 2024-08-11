package com.majibu.chatai.domain.use_case.language

import com.majibu.chatai.domain.repository.PreferenceRepository
import javax.inject.Inject

class SetCurrentLanguageCodeUseCase @Inject constructor(private val preferenceRepository: PreferenceRepository) {
    operator fun invoke(language: String) = preferenceRepository.setCurrentLanguageCode(language)
}