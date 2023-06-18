package com.dayvatas.kotlininstagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.dayvatas.kotlininstagram.databinding.RecyclerRowBinding
import com.dayvatas.kotlininstagram.model.Post
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter (private val postList : ArrayList<Post>) :
    RecyclerView.Adapter<FeedRecyclerAdapter.FeedHolder>() {
    class FeedHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedHolder {
        //recyclerRow ile yani layout ile burada bağlanacak
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FeedHolder(binding)
    }

    override fun onBindViewHolder(holder: FeedHolder, position: Int) {
        holder.binding.recyclerEmailText.text = postList.get(position).email
        holder.binding.recyclerCommentText.text = postList.get(position).comment
        Picasso.get().load(postList.get(position).downloadUrl).into(holder.binding.recyclerImageView)

    }
    override fun getItemCount(): Int {
        return postList.size
    }

}