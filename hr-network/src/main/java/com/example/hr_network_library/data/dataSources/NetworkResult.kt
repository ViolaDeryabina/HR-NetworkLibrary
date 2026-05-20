package com.example.hr_network_library.data.dataSources

// Назначение: Класс для создания обёртки для ответа
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026
sealed class NetworkResult<out T> {
    data class Success<out T>(val data: T) : NetworkResult<T>()
    data class Error(val status: Int, val message: String?) : NetworkResult<Nothing>()
    data class Exception(val message: String?) : NetworkResult<Nothing>()
}

fun <T, R> NetworkResult<T>.map(transform: (T) -> R): NetworkResult<R> {
    return when (this) {
        is NetworkResult.Success -> NetworkResult.Success(transform(data))
        is NetworkResult.Error -> NetworkResult.Error(status, message)
        is NetworkResult.Exception -> NetworkResult.Exception(message)
    }
}