package com.android.manualdependencyinjection.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.manualdependencyinjection.domain.AuthRepository
import kotlinx.coroutines.launch

class MainViewModel(private val authRepository: AuthRepository) : ViewModel() {

    fun login() {
        viewModelScope.launch {
            authRepository.login(email = "test@gmail.com", password = "Test123")
        }
    }

}