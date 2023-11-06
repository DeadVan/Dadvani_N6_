package com.example.dadvani_n6.models

import com.google.gson.annotations.SerializedName


data class DataModel(
    val data: List<Item>
) {
    data class Item(
        val id: Int,
        val name: String,
        val year: Int,
        val color: String,
        @SerializedName("pantone_value")
        val pantoneValue: String,
    )
}
