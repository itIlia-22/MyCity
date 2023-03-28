package com.example.mycity.ui.theme.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.R
import com.example.mycity.model.local.LocalCategory


//метод для отображения начального экрана с категориями других экрнов
@SuppressLint("ResourceType")
@Composable
fun CategoryMyCity(
    onButtonClickCategoryPark: () -> Unit,
    onButtonClickCategoryRest: () -> Unit,
    onButtonClickCategoryPub: () -> Unit,
    onButtonClickCategoryDos: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(50.dp),

        //horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(modifier = modifier.padding(top = 24.dp, start = 24.dp)) {
            IconButton(onClick = { onButtonClickCategoryPark() }) {
                Image(painter = painterResource(R.drawable.ic_park), contentDescription = null)
            }
            Text(
                text = stringResource(R.string.screen2),
                modifier = modifier.padding(start = 16.dp, top = 48.dp),
                style = MaterialTheme.typography.h6

                )
        }
        Row(modifier = modifier.padding(top = 24.dp, start = 24.dp)) {
            IconButton(onClick = { onButtonClickCategoryRest() }) {
                Image(painter = painterResource(R.drawable.ic_rest), contentDescription = null)
            }
            Text(
                text = stringResource(R.string.screen3),
                modifier = modifier.padding(start = 16.dp, top = 48.dp),
                style = MaterialTheme.typography.h6
                )
        }
        Row(modifier = modifier.padding(top = 24.dp, start = 24.dp)) {
            IconButton(onClick = { onButtonClickCategoryPub() }) {
                Image(painter = painterResource(R.drawable.ic_pub), contentDescription = null)
            }
            Text(
                text = stringResource(R.string.screen4),
                modifier = modifier.padding(start = 16.dp, top = 48.dp),
                style = MaterialTheme.typography.h6
                )
        }
        Row(modifier = modifier.padding(top = 24.dp, start = 24.dp)) {
            IconButton(onClick = { onButtonClickCategoryDos() }) {
                Image(painter = painterResource(R.drawable.ic_dos), contentDescription = null)
            }
            Text(
                text = stringResource(R.string.screen5),
                modifier = modifier.padding(start = 16.dp, top = 48.dp),
                style = MaterialTheme.typography.h6
                )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun CategoryMyCityPreview() {
    CategoryMyCity(
        onButtonClickCategoryPark = { /*TODO*/ },
        onButtonClickCategoryRest = { /*TODO*/ },
        onButtonClickCategoryPub = { /*TODO*/ },
        onButtonClickCategoryDos = { /*TODO*/ })
}
