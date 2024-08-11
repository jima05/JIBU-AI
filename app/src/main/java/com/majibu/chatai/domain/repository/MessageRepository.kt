package com.majibu.chatai.domain.repository

import com.majibu.chatai.data.model.MessageModel

interface MessageRepository {
    suspend fun getMessages(conversationId: String): List<MessageModel>
    suspend fun addMessage(message: MessageModel)
    suspend fun deleteMessages(conversationId: String)
}