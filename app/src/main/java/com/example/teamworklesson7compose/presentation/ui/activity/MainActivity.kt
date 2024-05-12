package com.example.teamworklesson7compose.presentation.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.android4_5.data.remote.models.character.ResultsItemCharacters
import com.example.teamworklesson7compose.domain.Result
import com.example.teamworklesson7compose.presentation.ui.screens.ImageAndText
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
                    ImageAndText(result = ResultsItemCharacters(image = "Image"))
                }
            }
        }
    }
}