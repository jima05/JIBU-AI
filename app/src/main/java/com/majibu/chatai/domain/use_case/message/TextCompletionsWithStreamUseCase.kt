package com.majibu.chatai.domain.use_case.message

import com.majibu.chatai.data.model.TextCompletionsParam
import com.majibu.chatai.domain.repository.ChatRepository
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class TextCompletionsWithStreamUseCase @Inject constructor(
    private val chatRepository: ChatRepository
) {
    operator fun invoke(scope: CoroutineScope, params: TextCompletionsParam) =
        chatRepository.textCompletionsWithStream(scope, params)
}