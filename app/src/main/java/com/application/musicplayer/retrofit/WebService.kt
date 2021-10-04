package com.application.musicplayer.retrofit

import com.application.musicplayer.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WebService {

    val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service = retrofit.create(ApiInterface::class.java)

}