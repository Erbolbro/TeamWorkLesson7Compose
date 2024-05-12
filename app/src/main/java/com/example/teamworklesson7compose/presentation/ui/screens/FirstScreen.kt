package com.example.teamworklesson7compose.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.teamworklesson7compose.R
import com.example.teamworklesson7compose.presentation.ui.activity.CharactersViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Preview
@Composable
fun ImageAndText(
    modifier: Modifier = Modifier,
    viewModel: CharactersViewModel = hiltViewModel()
) {
    Card(modifier = Modifier) {
        Box(modifier = Modifier) {
            Column {
                Image(
                    modifier = Modifier
                        .size(200.dp, 200.dp),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = R.string.image.toString(),
                )
                Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(
                        text = stringResource(R.string.text),
                        color = Color.Black
                    )
                }
            }
        }
    }
}