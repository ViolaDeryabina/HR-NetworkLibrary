package com.example.hr_network_library.common

import android.util.Log

// Назначение: Функции для вывода логов
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026

fun logDebug(title: String, description: String,message: String){
    Log.d("[$title]: ","$description - $message")
}

fun logInfo(title: String, description: String,message: String){
    Log.i("[$title]: ","$description - $message")
}

fun logError(title: String, description: String,message: String){
    Log.e("[$title]: ","$description - $message")
}