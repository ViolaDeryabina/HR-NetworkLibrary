package com.example.hr_network_library.data.result

import com.example.hr_network_library.data.dto.ApiError

// Назначение: Класс для создания обёртки для ответа
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026
sealed class NetworkResult<out T> {
    data class Success<out T>(val data: T) : NetworkResult<T>()
    data class Error(val apiError: ApiError) : NetworkResult<Nothing>()
    data class NetworkError(val throwable: Throwable) : NetworkResult<Nothing>()
}

fun <T, R> NetworkResult<T>.map(transform: (T) -> R): NetworkResult<R> = when (this) {
    is NetworkResult.Success -> NetworkResult.Success(transform(data))
    is NetworkResult.Error -> this
    is NetworkResult.NetworkError -> this
}