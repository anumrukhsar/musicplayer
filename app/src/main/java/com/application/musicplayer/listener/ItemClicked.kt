package com.application.musicplayer.listener

import com.application.musicplayer.retrofit.models.SongWrapper

interface ItemClicked {
     fun onItemClick(index:Int,song: SongWrapper)
}