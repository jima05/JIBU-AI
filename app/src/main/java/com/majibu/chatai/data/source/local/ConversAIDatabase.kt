package com.majibu.chatai.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.majibu.chatai.data.model.ConversationModel
import com.majibu.chatai.data.model.MessageModel

@Database(
    entities = [ConversationModel::class, MessageModel::class],
    version = 1,
    exportSchema = false
)
abstract class ConversAIDatabase : RoomDatabase() {
    abstract fun conversAIDao(): ConversAIDao
}