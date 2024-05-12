package com.example.teamworklesson7compose.presentation.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.android4_5.data.remote.models.character.ResultsItemCharacters
import com.example.teamworklesson7compose.R
import com.example.teamworklesson7compose.presentation.ui.activity.CharactersViewModel


@Composable
fun ImageAndText(
    modifier: Modifier = Modifier,
    result: ResultsItemCharacters,
    viewModel: CharactersViewModel = hiltViewModel()

) {
    Card(modifier = Modifier) {
        Box(modifier = modifier) {
            Column {
                AsyncImage(modifier = Modifier.size(180.dp, 200.dp)
                    ,model = result.image
                    , contentDescription = stringResource(R.string.image),
                    contentScale = ContentScale.Crop
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