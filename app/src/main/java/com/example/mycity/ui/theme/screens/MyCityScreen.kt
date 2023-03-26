package com.example.mycity.ui.theme.screens

import android.annotation.SuppressLint
import androidx.annotation.StringRes
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mycity.R

enum class MyCityScreen(@StringRes val title: Int) {
    Start(R.string.screen1),
    Category1(title = R.string.screen2),
    Category2(title = R.string.screen3),
    Category3(title = R.string.screen4),
    Category4(title = R.string.screen5),
}

@Composable
fun MyCityAppBar(
    currentScreen: MyCityScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        TopAppBar(
            { Text(text = stringResource(currentScreen.title)) },
            modifier = modifier,
            navigationIcon = {
                if (canNavigateBack) {
                    IconButton(onClick = navigateUp) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            },


            )
    }


}

@SuppressLint("ComposableDestinationInComposeScope")
@Composable
fun CityTreyApp(modifier: Modifier = Modifier) {
    val navController: NavHostController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = MyCityScreen.valueOf(
        backStackEntry?.destination?.route ?: MyCityScreen.Start.name
    )
    Scaffold(
        topBar = {
            MyCityAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = MyCityScreen.Start.name,
            modifier = modifier.padding(paddingValues)
        ) {
            composable(MyCityScreen.Start.name) {
                CategoryMyCity(
                    onButtonClickCategoryPark = { navController.navigate(MyCityScreen.Category1.name) },
                    onButtonClickCategoryRest = { navController.navigate(MyCityScreen.Category2.name) },
                    onButtonClickCategoryPub = { navController.navigate(MyCityScreen.Category3.name) },
                    onButtonClickCategoryDos = { navController.navigate(MyCityScreen.Category4.name) })


            }
            composable(MyCityScreen.Category1.name) {
                ListPark()
            }
            composable(MyCityScreen.Category2.name) {
                ListRest()
            }
            composable(MyCityScreen.Category3.name) {
                ListPub()
            }

            composable(MyCityScreen.Category4.name) {
                ListDos()
            }


        }
    }


}

@Preview
@Composable
fun CityTreyAppPreview() {
    CityTreyApp()
}