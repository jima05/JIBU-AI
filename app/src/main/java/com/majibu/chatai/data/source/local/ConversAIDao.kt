package com.majibu.chatai.data.source.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.majibu.chatai.common.Constants
import com.majibu.chatai.data.model.ConversationModel
import com.majibu.chatai.data.model.MessageModel

@Dao
interface ConversAIDao {

    @Query(Constants.Queries.GET_CONVERSATIONS)
    suspend fun getConversations(): MutableList<ConversationModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addConversation(conversationModel: ConversationModel)

    @Query(Constants.Queries.DELETE_CONVERSATION)
    suspend fun deleteConversation(id: String)

    @Query(Constants.Queries.DELETE_ALL_CONVERSATION)
    suspend fun deleteAllConversation()

    @Query(Constants.Queries.GET_MESSAGES)
    suspend fun getMessages(conversationId: String): List<MessageModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMessage(messageModel: MessageModel)

    @Query(Constants.Queries.DELETE_MESSAGES)
    suspend fun deleteMessages(conversationId: String)

}