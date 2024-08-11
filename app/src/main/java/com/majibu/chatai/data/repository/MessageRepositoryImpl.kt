package com.majibu.chatai.data.repository

import com.majibu.chatai.data.model.MessageModel
import com.majibu.chatai.data.source.local.ConversAIDao
import com.majibu.chatai.domain.repository.MessageRepository
import javax.inject.Inject

class MessageRepositoryImpl @Inject constructor(
    private val conversAIDao: ConversAIDao,
) : MessageRepository {
    override suspend fun getMessages(conversationId: String): List<MessageModel> =
        conversAIDao.getMessages(conversationId)

    override suspend fun addMessage(message: MessageModel) =
        conversAIDao.addMessage(message)

    override suspend fun deleteMessages(conversationId: String) =
        conversAIDao.deleteMessages(conversationId)
}