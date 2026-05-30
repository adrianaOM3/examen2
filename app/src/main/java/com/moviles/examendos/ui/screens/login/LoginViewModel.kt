package com.moviles.examendos.ui.screens.login

import com.moviles.examendos.data.remote.model.UserDto
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.moviles.examendos.data.repository.AuthRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


data class LoginUiState(
    val isLoading: Boolean = false,
    val user: UserDto? = null,
    val errorMessage: String? = null
)

class LoginViewModel(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _uiState =
        MutableStateFlow(LoginUiState())

    val uiState =
        _uiState.asStateFlow()

    fun login(
        email: String,
        password: String
    ) {

        viewModelScope.launch {

            _uiState.value = _uiState.value.copy(
                isLoading = true,
                errorMessage = null
            )

            delay(1000)

            val user =
                authRepository.login(
                    email,
                    password
                )

            if (user != null) {

                _uiState.value =
                    _uiState.value.copy(
                        isLoading = false,
                        user = user
                    )

            } else {

                _uiState.value =
                    _uiState.value.copy(
                        isLoading = false,
                        errorMessage = "Invalid email or password"
                    )
            }
        }
    }

    fun clearError() {

        _uiState.value =
            _uiState.value.copy(
                errorMessage = null
            )
    }
}

class LoginViewModelFactory(
    private val repository: AuthRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(
        modelClass: Class<T>
    ): T {

        if (
            modelClass.isAssignableFrom(
                LoginViewModel::class.java
            )
        ) {

            return LoginViewModel(
                repository
            ) as T
        }

        throw IllegalArgumentException(
            "Unknown ViewModel class"
        )
    }
}
