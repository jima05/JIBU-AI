package com.majibu.chatai.domain.use_case.conversation

import com.majibu.chatai.data.model.ConversationModel
import com.majibu.chatai.domain.repository.ConversationRepository
import javax.inject.Inject

class CreateConversationUseCase @Inject constructor(
    private val conversationRepository: ConversationRepository
) {
    suspend operator fun invoke(conversation: ConversationModel) =
        conversationRepository.addConversation(conversation)
}