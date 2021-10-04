package com.application.musicplayer.retrofit.models

import com.application.musicplayer.retrofit.models.SongWrapper
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WebResponse{
    @SerializedName("resultCount")
    @Expose
    private var resultCount: Int? = null

    @SerializedName("results")
    @Expose
    private var results: List<SongWrapper>? = ArrayList()

    fun getResultCount(): Int? {
        return resultCount
    }

    fun setResultCount(resultCount: Int?) {
        this.resultCount = resultCount
    }

    fun getResults(): List<SongWrapper>? {
        return results
    }

    fun setResults(results: List<SongWrapper>?) {
        this.results = results
    }

}

