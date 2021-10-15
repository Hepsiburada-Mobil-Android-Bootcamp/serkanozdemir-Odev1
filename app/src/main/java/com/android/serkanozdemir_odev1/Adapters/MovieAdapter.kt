package com.android.serkanozdemir_odev1.Adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.android.serkanozdemir_odev1.Data.Movie
import com.android.serkanozdemir_odev1.R
import com.android.serkanozdemir_odev1.databinding.ItemMovieBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieAdapter (private val context : Context, private val movies:List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var _binding: ItemMovieBinding? = null
    private val binding get() = _binding!!

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie,parent,false)
        _binding=DataBindingUtil.bind(view)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        Glide.with(binding.imgMovie)
            .asBitmap()
            .load(movies[position].urlMovie)
            .into(binding.imgMovie)
        binding.textScore.text = movies[position].score
    }

    override fun getItemCount()= movies.size
}