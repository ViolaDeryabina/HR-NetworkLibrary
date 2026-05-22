package com.example.hr_network_library.data.dto.comment

import com.google.gson.annotations.SerializedName

data class CommentItem(
    @SerializedName("created")
    val created: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("updated")
    val updated: String
)
