package com.moviles.examendos.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.moviles.examendos.core.UserMessages

@Composable
fun LoginEmailField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    AppTextField(
        value = value,
        label = UserMessages.LoginUi.EMAIL_LABEL,
        placeholder = UserMessages.LoginUi.EMAIL_PLACEHOLDER,
        onValueChange = onValueChange,
        modifier = modifier,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}

@Composable
fun LoginPasswordField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    AppTextField(
        value = value,
        label = UserMessages.LoginUi.PASSWORD_LABEL,
        placeholder = "\u2022\u2022\u2022\u2022\u2022\u2022\u2022",
        onValueChange = onValueChange,
        modifier = modifier,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation()
    )
}

