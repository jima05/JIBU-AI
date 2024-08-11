package com.majibu.chatai.domain.use_case.message

import com.majibu.chatai.data.model.MessageModel
import com.majibu.chatai.domain.repository.MessageRepository
import javax.inject.Inject

class CreateMessagesUseCase @Inject constructor(
    private val messageRepository: MessageRepository
) {
    suspend operator fun invoke(message: MessageModel) =
        messageRepository.addMessage(message)
}