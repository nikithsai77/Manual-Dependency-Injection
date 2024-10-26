package com.android.manualdependencyinjection

import android.app.Application
import com.android.manualdependencyinjection.di.AppModule
import com.android.manualdependencyinjection.di.AppModuleImpl

class App : Application() {

    val appModule: AppModule by lazy {
        AppModuleImpl(context = this)
    }

}