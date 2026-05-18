package com.example.hr_network_library.data.dataSources

import com.example.hr_network_library.common.logDebug
import com.example.hr_network_library.data.dto.ApiError
import com.google.gson.Gson
import okio.IOException
import retrofit2.HttpException

// Назначение: Адаптер для обработки ответа от сервера через API
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026

object ApiCallAdapter {
    suspend fun <T>safeApiCall(call: suspend ()-> T): NetworkResult<T>{
        return try {
            logDebug("ApiCallAdapter", "Запрос", "Success")
            NetworkResult.Success(call())
        }catch (e: HttpException){
            val errorBody = e.response()?.errorBody()?.toString()
            val errorMessage = try {
                val error = Gson().fromJson(errorBody, ApiError::class.java)
                error.message
            }catch (_: Exception){
                e.message
            }
            logDebug("ApiCallAdapter", "Error", "${e.code()}, $errorMessage")
            NetworkResult.Error(e.code(),errorMessage)
        }catch (e: IOException){
            logDebug("ApiCallAdapter", "Exception", "${e.message}")
            NetworkResult.Exception(e.message)
        }catch (e: Throwable){
            logDebug("ApiCallAdapter", "Exception", "${e.message}")
            NetworkResult.Exception(e.message)
        }
    }
}