package com.example.presentation.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.presentation.R
import com.example.presentation.ui.activity.CharactersViewModel
import com.example.utils.UIState


@Composable
fun CharacterScreen(
    modifier: Modifier = Modifier,
    viewModel: CharactersViewModel = hiltViewModel()

) {
    val characters by viewModel.characterState.observeAsState()

    Box(modifier = Modifier.padding(4.dp)){
        LazyColumn(modifier = modifier.padding(4.dp)) {
            when (characters) {
                is UIState.Error -> {
                    Log.e(
                        "character",
                        "CharacterScreen:${(characters as UIState.Error).message}"
                    )
                }
                UIState.Loading -> {

                }

                is UIState.Success -> {
                    (characters as UIState.Success<List<Character>>).data?.let {
                        items(it) { item ->
                            LazyColumnCharacters(character = item)
                        }
                    }
                }

                null -> TODO()
            }
        }
    }
}


@Composable
fun LazyColumnCharacters(modifier: Modifier = Modifier, character: Character) {
    Card(
        modifier = modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.wrapContentSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(180.dp, 180.dp)
                        .clip(CircleShape),
                    model = character.image,
                    contentDescription = stringResource(id = R.string.image),
                    alignment = Alignment.Center
                )
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = character.name,
                    fontSize = 30.sp
                )
            }
        }
    }
}
