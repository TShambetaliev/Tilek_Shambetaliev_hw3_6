package com.example.tilek_shambetaliev_hw3_6


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.tilek_shambetaliev_hw3_6.databinding.ItemSongsBinding

class SongAdapter(val songList: ArrayList<Songs>, private val onClick: (tvSongs:String)->Unit) : Adapter<SongAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
return ViewHolder(ItemSongsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = songList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(songList[position])
    }

    inner class ViewHolder(private val binding: ItemSongsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(songs:Songs) {
            binding.apply {
                tvNumber.text = songs.number
                tvSongs.text = songs.songName
                tvSinger.text = songs.singerName
                tvDuration.text = songs.songDuration
            }
            itemView.setOnClickListener{
                songList[adapterPosition].songName?.let { it1 -> onClick(it1) }
            }
        }
    }
}

