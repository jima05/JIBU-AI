package com.majibu.chatai.domain.repository

interface FirebaseRepository {
    suspend fun isThereUpdate(): Boolean
}