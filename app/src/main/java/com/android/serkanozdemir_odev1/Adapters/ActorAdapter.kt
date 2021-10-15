package com.android.serkanozdemir_odev1.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.android.serkanozdemir_odev1.Data.Actor

import com.android.serkanozdemir_odev1.R
import com.android.serkanozdemir_odev1.databinding.ItemActorBinding
import com.bumptech.glide.Glide

class ActorAdapter(private val context : Context, private val actors:List<Actor>): RecyclerView.Adapter<ActorAdapter.ActorViewHolder>() {
    private var _binding: ItemActorBinding? = null
    private val binding get() = _binding!!
    inner class ActorViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_actor,parent,false)
        _binding= DataBindingUtil.bind(view)
        return ActorViewHolder(view)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        Glide.with(binding.imgActor)
            .asBitmap()
            .load(actors[position].imgUrl)
            .into(binding.imgActor)
        binding.actorName.text = actors[position].nameActor
    }

    override fun getItemCount()=actors.size

}