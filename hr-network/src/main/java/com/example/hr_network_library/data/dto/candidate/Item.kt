package com.example.hr_network_library.data.dto.candidate

import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("candidate")
    val candidate: String,
    @SerializedName("created")
    val created: String,
    @SerializedName("expand")
    val expand: Expand?,
    @SerializedName("id")
    val id: String,
    @SerializedName("updated")
    val updated: String,
    @SerializedName("vacancy")
    val vacancy: String
)
