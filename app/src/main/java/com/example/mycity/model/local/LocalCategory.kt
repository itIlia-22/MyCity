package com.example.mycity.model.local

import com.example.mycity.R
import com.example.mycity.model.CategoryDetails

object LocalCategory {


    val categoryPark = listOf(
        CategoryDetails(
            name = R.string.park_pobeda,
            desc = R.string.park_pobeda_details,
            image = R.drawable.pobeda

        ),
        CategoryDetails(
            name = R.string.park_gagarina,
            desc = R.string.park_gagarina_details,
            image = R.drawable.gag

        ),
        CategoryDetails(
            name = R.string.park_zagorod,
            desc = R.string.park_zagorod_details,
            image = R.drawable.zagor

        ),
        CategoryDetails(
            name = R.string.park_vert,
            desc = R.string.park_vert_details,
            image = R.drawable.vrtl

        ),


        )
    val categoryRest = listOf(
        CategoryDetails(
            name = R.string.rest_chesnok,
            desc = R.string.rest_chesnok_details,
            image = R.drawable.pochesnoku

        ),
        CategoryDetails(
            name = R.string.rest_chesnie,
            desc = R.string.rest_chesnie_details,
            image = R.drawable.ic_checni

        ),
        CategoryDetails(
            name = R.string.rest_xokky,
            desc = R.string.rest_xokky_details,
            image = R.drawable.xokky

        ),
        CategoryDetails(
            name = R.string.rest_iskra,
            desc = R.string.rest_iskra_details,
            image = R.drawable.iskra

        ),


        )
    val categoryDos = listOf(
        CategoryDetails(
            name = R.string.dos_zavod,
            desc = R.string.dos_zavod_details,
            image = R.drawable.pivo

        ),
        CategoryDetails(
            name = R.string.dos_stalin,
            desc = R.string.dos_stalin_details,
            image = R.drawable.stalin

        ),
        CategoryDetails(
            name = R.string.dos_slava,
            desc = R.string.dos_slava_details,
            image = R.drawable.slava

        ),
        CategoryDetails(
            name = R.string.dos_il,
            desc = R.string.dos_il_details,
            image = R.drawable.il_two

        ),


        )
    val categoryPubCenter = listOf(
        CategoryDetails(
            name = R.string.pub_avrora,
            desc = R.string.pub_avrora_details,
            image = R.drawable.avrora

        ),
        CategoryDetails(
            name = R.string.pub_kosmo,
            desc = R.string.pub_kosmo_details,
            image = R.drawable.kosmo

        ),
        CategoryDetails(
            name = R.string.pub_gudok,
            desc = R.string.pub_gudok_details,
            image = R.drawable.gudok

        ),
        CategoryDetails(
            name = R.string.pub_mega,
            desc = R.string.pub_mega_details,
            image = R.drawable.mega

        ),


        )
}