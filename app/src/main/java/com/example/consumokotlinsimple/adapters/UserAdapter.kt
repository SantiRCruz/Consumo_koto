package com.example.consumokotlinsimple.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.consumokotlinsimple.models.Data

class UserAdapter(private val list: List<Data>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val item =
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class UserViewHolder():RecyclerView.ViewHolder(binding.root){
        fun bind(item : Data){

        }
    }
}