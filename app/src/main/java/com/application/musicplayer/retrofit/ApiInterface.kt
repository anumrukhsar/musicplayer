package com.application.musicplayer.retrofit

import com.application.musicplayer.retrofit.models.WebResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    //Get Songs
    @GET("search")
    fun searchSongsByArtist(
        @Query("term") term: String
    ): Call<WebResponse>
}