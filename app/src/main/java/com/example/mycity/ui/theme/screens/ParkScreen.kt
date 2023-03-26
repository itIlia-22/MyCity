package com.example.mycity.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.R
import com.example.mycity.model.CategoryDetails
import com.example.mycity.model.local.LocalCategory

@Composable
fun ListPark(
    modifier: Modifier = Modifier
) {
    LazyColumn() {
        items(LocalCategory.categoryPark) {
            CardCategory(categoryDetails = it)
        }
    }
}

@Composable
fun CardCategory(
    categoryDetails: CategoryDetails,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = 4.dp,
        modifier = modifier.padding(6.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(categoryDetails.image), contentDescription = null,
                modifier = modifier
                    .size(width = 500.dp, height = 500.dp),
                contentScale = ContentScale.Crop
            )
            Text(text = stringResource(categoryDetails.name), modifier = modifier.padding(16.dp))
            Text(text = stringResource(categoryDetails.desc))
        }

    }

}

@Preview
@Composable
fun CardCategoryPreview() {
    CardCategory(
        categoryDetails = CategoryDetails(
            R.string.dos_slava,
            R.string.dos_slava_details,
            R.drawable.slava
        )
    )
}