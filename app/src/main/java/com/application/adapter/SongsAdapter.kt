package com.application.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.application.musicplayer.R
import com.application.musicplayer.listener.ItemClicked
import com.application.musicplayer.retrofit.models.SongWrapper
import com.bumptech.glide.Glide

class SongsAdapter(context: Context,itemClicked: ItemClicked) : RecyclerView.Adapter<SongsAdapter.VH>() {
    lateinit var context: Context
    var songs: ArrayList<SongWrapper> = ArrayList()
    var clicked : ItemClicked? = null
    var playingSong : SongWrapper? = null

    init {
        this.context = context
        this.clicked=itemClicked
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        var view = LayoutInflater.from(context).inflate(R.layout.item_song, parent, false)
        return VH(view)
    }


    override fun onBindViewHolder(holder: VH, position: Int) {
        Glide.with(context).load(songs.get(position).getArtworkUrl100()).into(holder.ivImage)
        holder.tvSongName.text = songs.get(position).getTrackName()
        holder.tvAlbumName.text = songs.get(position).getCollectionName()
        holder.tvArtistName.text = songs.get(position).getArtistName()
        holder.itemView.setOnClickListener {
            if(playingSong!=null) playingSong?.setIsPlaying(false)
            if (songs.get(position).getIsPlaying()!!) {
                playingSong=songs.get(position)
                songs.get(position).setIsPlaying(true)

            }
            else {
                songs.get(position).setIsPlaying(false)
            }
            if(clicked!=null)
                clicked?.onItemClick(position,song = songs.get(position))

        }

    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cardView: CardView = itemView.findViewById(R.id.card_view)
        var ivImage: ImageView = itemView.findViewById(R.id.ivSongAlbum)
        var tvSongName: TextView = itemView.findViewById(R.id.tvSongName)
        var tvArtistName: TextView = itemView.findViewById(R.id.tvArtistName)
        var tvAlbumName: TextView = itemView.findViewById(R.id.tvAlbumName)
    }

}