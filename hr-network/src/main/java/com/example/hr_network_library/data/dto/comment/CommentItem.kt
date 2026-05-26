package com.example.hr_network_library.data.dto.comment

import com.google.gson.annotations.SerializedName

// Назначение: Класс для получения элемента Comment
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
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
