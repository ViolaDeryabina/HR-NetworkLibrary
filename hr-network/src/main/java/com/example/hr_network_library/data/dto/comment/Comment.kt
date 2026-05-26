package com.example.hr_network_library.data.dto.comment


import com.google.gson.annotations.SerializedName

// Назначение: Класс для получения листа items
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class Comment(
    @SerializedName("items")
    val items: List<CommentItem>
)