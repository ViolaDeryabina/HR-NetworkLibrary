package com.example.hr_network_library.data.dto.candidate


import com.google.gson.annotations.SerializedName

data class Items(
    @SerializedName("items")
    val items: List<Item>
)