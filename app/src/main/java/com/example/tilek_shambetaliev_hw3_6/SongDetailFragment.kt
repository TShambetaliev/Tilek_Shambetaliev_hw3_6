package com.example.tilek_shambetaliev_hw3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tilek_shambetaliev_hw3_6.databinding.FragmentSongDetailBinding
import com.example.tilek_shambetaliev_hw3_6.databinding.FragmentSongListBinding

class SongDetailFragment : Fragment() {
    private lateinit var binding: FragmentSongDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongDetailBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val result = arguments?.getString("Key")
        binding.tvSingerDetail.text = result
    }
}