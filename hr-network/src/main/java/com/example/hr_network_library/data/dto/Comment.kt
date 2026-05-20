package com.example.hr_network_library.data.dto


import com.google.gson.annotations.SerializedName

data class Comment(
    @SerializedName("items")
    val items: List<CommentItem>
)