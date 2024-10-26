package com.android.manualdependencyinjection.data

import com.android.manualdependencyinjection.domain.AuthRepository

class AuthRepositoryImpl : AuthRepository {

    override suspend fun login(email: String, password: String) {
        println("kk email Id is $email and Password is $password")
    }

}