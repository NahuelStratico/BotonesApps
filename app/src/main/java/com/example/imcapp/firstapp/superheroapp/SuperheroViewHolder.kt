package com.example.imcapp.firstapp.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.imcapp.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind( SuperHeroItemResponse: SuperHeroItemResponse, onItemSelected: (String) -> Unit ) {
        binding.tvSuperheroName.text = SuperHeroItemResponse.name
        Picasso.get().load(SuperHeroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected( SuperHeroItemResponse.superheroId ) }
    }
}