package com.android.manualdependencyinjection.di

import android.content.Context
import com.android.manualdependencyinjection.data.AuthRepositoryImpl
import com.android.manualdependencyinjection.domain.AuthRepository

interface AppModule {
    val authRepository: AuthRepository
}

class AppModuleImpl(context: Context): AppModule {

    init {
        println("kk AppModuleImpl: $context")
    }

    override val authRepository: AuthRepository by lazy {
        AuthRepositoryImpl()
    }

}