package com.android.serkanozdemir_odev1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.serkanozdemir_odev1.Adapters.ActorAdapter
import com.android.serkanozdemir_odev1.Adapters.MovieAdapter
import com.android.serkanozdemir_odev1.Data.Actor
import com.android.serkanozdemir_odev1.Data.Movie
import com.android.serkanozdemir_odev1.databinding.FragmentSecondBinding


class SecondFragment :Fragment(){

    private val movies = listOf(
        Movie("https://m.media-amazon.com/images/M/MV5BOTk5ODg0OTU5M15BMl5BanBnXkFtZTgwMDQ3MDY3NjM@._V1_QL50_SY1000_CR0,0,674,1000_AL_.jpg","6.9"),
        Movie("https://image.tmdb.org/t/p/original/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg","8.4"),
        Movie("https://image.tmdb.org/t/p/original/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg","8.6"),
        Movie("https://image.tmdb.org/t/p/original/qJ2tW6WMUDux911r6m7haRef0WH.jpg","9.0")
    )
    private val actors = listOf(
        Actor("Robert De Niro","https://upload.wikimedia.org/wikipedia/commons/5/58/Robert_De_Niro_Cannes_2016.jpg"),
        Actor("Johnny Depp","https://upload.wikimedia.org/wikipedia/commons/3/3b/Johnny_Depp-2757_%28cropped%29.jpg"),
        Actor("Marlon Brando","https://upload.wikimedia.org/wikipedia/commons/e/e3/Marlon_Brando_by_Edward_Cronenweth%2C_1955.jpg"),
        Actor("Robert Downey Jr.","https://upload.wikimedia.org/wikipedia/commons/9/94/Robert_Downey_Jr_2014_Comic_Con_%28cropped%29.jpg"),
        Actor("Scarlett Johansson","https://upload.wikimedia.org/wikipedia/commons/2/2a/Scarlett_Johansson_by_Gage_Skidmore_2_%28cropped%2C_2%29.jpg"),
        Actor("Margot Robbie","https://upload.wikimedia.org/wikipedia/commons/c/ce/Robbie_at_2019_Cannes_%28cropped%29.jpg"),
        Actor("Will Smith","https://upload.wikimedia.org/wikipedia/commons/6/65/Will_Smith_by_Gage_Skidmore.jpg")
    )
    private var _binding : FragmentSecondBinding?=null
    private val binding get()= _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerMovie.adapter=MovieAdapter(view.context,movies)
        binding.recyclerActors.adapter=ActorAdapter(view.context,actors)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}