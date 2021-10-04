package com.application.musicplayer.activities

import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.TextView.OnEditorActionListener
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.application.adapter.SongsAdapter
import com.application.musicplayer.R
import com.application.musicplayer.databinding.ActivityMainBinding
import com.application.musicplayer.listener.ItemClicked
import com.application.musicplayer.retrofit.WebService
import com.application.musicplayer.retrofit.models.SongWrapper
import com.application.musicplayer.retrofit.models.WebResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity(), ItemClicked {
    lateinit var binding: ActivityMainBinding
    lateinit var songsAdapter: SongsAdapter
    var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initSongsAdapter()
        initListener()

    }

    private fun initListener() {
        binding.etSearch.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                if (binding.etSearch.text.toString().trim().length > 0) {
                    songsAdapter.playingSong?.setIsPlaying(false)
                    stopMediaPlayer()
                    getSongs(binding.etSearch.text.toString().trim())
                }
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun initSongsAdapter() {
        songsAdapter = SongsAdapter(this, this)
        binding.rvSongList.layoutManager = LinearLayoutManager(this)
        binding.rvSongList.adapter = songsAdapter

    }

    private fun getSongs(artist: String) {
        binding.loader.visibility=View.VISIBLE
        WebService.service.searchSongsByArtist(artist).enqueue(object : Callback<WebResponse> {
            override fun onResponse(call: Call<WebResponse>?, response: Response<WebResponse>?) {
                binding.loader.visibility=View.GONE

                if (response?.body()?.getResults()?.size!! > 0) {
                    showData()

                    songsAdapter.songs.clear()
                    songsAdapter.songs.addAll(response?.body()?.getResults()!!)
                } else {
                    hideData()
                }
                hideKeyboard()
            }

            override fun onFailure(call: Call<WebResponse>?, t: Throwable?) {
                binding.loader.visibility=View.GONE

                hideData()
                hideKeyboard()
            }

        })
    }

    fun showData() {
        binding.rvSongList.visibility = View.VISIBLE
        binding.tvNoDataFound.visibility = View.GONE
    }

    fun hideData() {

        binding.rvSongList.visibility = View.GONE
        binding.tvNoDataFound.visibility = View.VISIBLE
    }

    override fun onItemClick(index: Int, song: SongWrapper) {
        playMedia(song.getPreviewUrl())
    }

    private fun playMedia(previewUrl: String?) {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer().apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
            setDataSource(previewUrl!!)
            prepare() // might take long! (for buffering, etc)
            start()
        }
    }

    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm: InputMethodManager =
                this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        stopMediaPlayer()

    }

    private fun stopMediaPlayer() {
        if (mediaPlayer != null) {
           if(mediaPlayer?.isPlaying()!!) mediaPlayer?.stop()
            mediaPlayer?.release()
        }
    }

}