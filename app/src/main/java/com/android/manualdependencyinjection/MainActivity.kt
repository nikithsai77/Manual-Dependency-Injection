package com.android.manualdependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.android.manualdependencyinjection.presentation.MainViewModel
import com.android.manualdependencyinjection.presentation.viewModelFactory
import com.android.manualdependencyinjection.ui.theme.ManualDependencyInjectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManualDependencyInjectionTheme {
                val mainViewModel = viewModel<MainViewModel>(
                    factory = viewModelFactory {
                        MainViewModel((application as App).appModule.authRepository)
                    }
                )
                Button(onClick = {
                    mainViewModel.login()
                }) {
                    Text(text = "Login")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ManualDependencyInjectionTheme {

    }
}