package com.majibu.chatai.domain.repository

import com.majibu.chatai.data.model.ConversationModel

interface ConversationRepository {
    suspend fun getConversations(): MutableList<ConversationModel>
    suspend fun addConversation(conversation: ConversationModel)
    suspend fun deleteConversation(conversationId: String)
    suspend fun deleteAllConversation()
}