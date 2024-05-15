<<<<<<< HEAD:app/src/main/java/com/example/teamworklesson7compose/presentation/ui/activity/MainActivity.kt
package com.example.teamworklesson7compose.presentation.ui.activity
=======
package com.example.presentation.ui.activity
>>>>>>> cfc50ee7abe09ee4243744edd0468723bc5f5f0f:presentation/src/main/java/com/example/presentation/ui/activity/MainActivity.kt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
<<<<<<< HEAD:app/src/main/java/com/example/teamworklesson7compose/presentation/ui/activity/MainActivity.kt
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.teamworklesson7compose.presentation.ui.screens.CharacterScreen
import com.example.teamworklesson7compose.presentation.ui.screens.LazyColumnCharacters
import com.example.teamworklesson7compose.presentation.ui.theme.TeamWorkLesson7ComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
=======
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.presentation.ui.theme.TeamWorkLesson7ComposeTheme

>>>>>>> cfc50ee7abe09ee4243744edd0468723bc5f5f0f:presentation/src/main/java/com/example/presentation/ui/activity/MainActivity.kt
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
<<<<<<< HEAD:app/src/main/java/com/example/teamworklesson7compose/presentation/ui/activity/MainActivity.kt
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
=======
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Greeting(
                    name = "Android",
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TeamWorkLesson7ComposeTheme {
        Greeting("Android")
    }
>>>>>>> cfc50ee7abe09ee4243744edd0468723bc5f5f0f:presentation/src/main/java/com/example/presentation/ui/activity/MainActivity.kt
}