package com.example.mycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Класс данных для карточек с категориями
 */
data class CategoryDetails(
    @StringRes val name: Int,
    @StringRes val desc: Int,
    @DrawableRes val image: Int
)
