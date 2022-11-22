package com.example.consumokotlinsimple.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.consumokotlinsimple.databinding.ItemUsersBinding
import com.example.consumokotlinsimple.models.Data

class UserAdapter(private val list: List<Data>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val item = ItemUsersBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserViewHolder(item)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class UserViewHolder(private val binding: ItemUsersBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item : Data){
            binding.tvName.text = item.first_name
            binding.tvLast.text = item.last_name
            binding.tvEmail.text = item.email
        }
    }
}