package com.majibu.chatai.ui.signup

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.majibu.chatai.domain.use_case.auth.SignupUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor(
    private val signupUseCase: SignupUseCase
) : ViewModel() {

    val signupState = mutableStateOf<SignupState>(SignupState.Idle)

    fun signup(email: String, password: String) {
        viewModelScope.launch {
            signupState.value = SignupState.Loading
            val result = signupUseCase(email, password)
            signupState.value = if (result.isSuccess) {
                SignupState.Success
            } else {
                SignupState.Error(result.exceptionOrNull()?.message ?: "Unknown error")
            }
        }
    }
}

sealed class SignupState {
    object Idle : SignupState()
    object Loading : SignupState()
    object Success : SignupState()
    data class Error(val message: String) : SignupState()
}
