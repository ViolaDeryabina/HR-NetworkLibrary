package com.example.hr_network_library

import okhttp3.mockwebserver.MockWebServer
import org.junit.rules.ExternalResource
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerTestRule: ExternalResource() {

        val mockWebServer = MockWebServer()

        val retrofit: Retrofit =
            Retrofit.Builder()
                .baseUrl(mockWebServer.url("/"))
                .addConverterFactory(GsonConverterFactory.create())
                .build()


        override fun before() = mockWebServer.start()

        override fun after() = mockWebServer.close()
}