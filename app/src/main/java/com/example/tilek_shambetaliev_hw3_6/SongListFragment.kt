package com.example.tilek_shambetaliev_hw3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import com.example.tilek_shambetaliev_hw3_6.databinding.FragmentSongListBinding

class SongListFragment : Fragment() {

    private lateinit var binding: FragmentSongListBinding
    private var songSList = arrayListOf(
        Songs("1","Кечки Бишкек", "Мирбек Атабеков", "4:20"),
        Songs("2","Сагынам", "Мирбек Атабеков", "3:45"),
        Songs("3","Керексин", "Нурлан Насип", "3:03"),
        Songs("4","Суйоо беремин", "Улан Осмон уулу", "2:44"),
        Songs("5","Бат эле унутам", "Jax 02:14", "4:25"),
        Songs("6","Ким билет", "Jax 02:14", "3:52"),
        Songs("7","Сени менен", "Мирбек Атабеков", "4:01"),
        Songs("8","Мен сага жакпай койдум", "Нурлан Насип", "3:24"),
        Songs("9","Тагдырын сага жазганда", "Арсен", "3:48"),
        Songs("10","Сагыныч", "Улан Осмон уулу", "3:38"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = SongAdapter(songSList,this::onClick)
        binding.rvSong.adapter = adapter

    }

    private fun onClick(tvSongs:String){
        requireActivity().supportFragmentManager.findFragmentById(R.id.fragment1_container)?.view?.isGone=true
        val bundle = Bundle()
        bundle.putString("Key",tvSongs)
        val songDetailFragment=SongDetailFragment()
        songDetailFragment.arguments=bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment2_container, songDetailFragment).addToBackStack(null).commit()
    }
}
