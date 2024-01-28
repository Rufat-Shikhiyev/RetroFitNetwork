package com.example.retrofit.network

import Json4Kotlin_Base
import retrofit2.http.GET

interface ApiServices {

    @GET("flights")
    suspend fun getFlights(): Json4Kotlin_Base


}