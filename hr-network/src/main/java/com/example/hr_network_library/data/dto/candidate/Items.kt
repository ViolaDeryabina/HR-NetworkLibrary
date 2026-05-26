package com.example.hr_network_library.data.dto.candidate


import com.google.gson.annotations.SerializedName

// Назначение: Класс получения листа item
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class Items(
    @SerializedName("items")
    val items: List<Item>
)