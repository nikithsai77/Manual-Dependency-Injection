package com.android.manualdependencyinjection.domain

interface AuthRepository {
    suspend fun login(email: String, password: String)
}