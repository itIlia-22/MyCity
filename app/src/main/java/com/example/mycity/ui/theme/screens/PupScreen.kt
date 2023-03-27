package com.example.mycity.ui.theme.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
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
import com.example.mycity.ui.theme.utils.IconDescription

@Composable
fun ListPub(
    modifier: Modifier = Modifier
) {
    LazyColumn() {
        items(LocalCategory.categoryPubCenter) {
            CardCategoryPub(categoryDetails = it)
        }
    }
}

@Composable
fun CardCategoryPub(
    categoryDetails: CategoryDetails,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        elevation = 4.dp,
        modifier = modifier.padding(6.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(categoryDetails.image), contentDescription = null,
                modifier = modifier
                    .size(width = 500.dp, height = 200.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(categoryDetails.name),
                modifier = modifier.padding(16.dp),
                style = MaterialTheme.typography.h2

            )
            IconDescription(
                expanded = expanded,
                onClick = { expanded = !expanded })
            if (expanded) {
                Text(
                    text = stringResource(categoryDetails.desc),
                    modifier = modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }


        }

    }

}

@Preview
@Composable
fun CardCategoryPubPreview() {
    CardCategory(
        categoryDetails = CategoryDetails(
            R.string.dos_slava,
            R.string.dos_slava_details,
            R.drawable.slava
        )
    )
}