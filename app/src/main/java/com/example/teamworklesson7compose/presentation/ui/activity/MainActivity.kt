package com.example.teamworklesson7compose.presentation.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.teamworklesson7compose.presentation.ui.screens.CharacterScreen
import com.example.teamworklesson7compose.presentation.ui.screens.LazyColumnCharacters
import com.example.teamworklesson7compose.presentation.ui.theme.TeamWorkLesson7ComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TeamWorkLesson7ComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CharacterScreen(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}