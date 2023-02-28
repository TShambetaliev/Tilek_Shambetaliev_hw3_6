package com.example.tilek_shambetaliev_hw3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tilek_shambetaliev_hw3_6.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvSongDetail.text = intent.getStringExtra("name").toString()
        binding.tvSingerDetail.text = intent.getStringExtra("singer").toString()
    }
}