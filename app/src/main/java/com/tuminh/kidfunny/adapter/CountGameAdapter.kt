package com.tuminh.kidfunny.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tuminh.kidfunny.R
import com.tuminh.kidfunny.view.story.ActivityStoryDetailPage

class CountGameAdapter(val listImage:ArrayList<Int>): RecyclerView.Adapter<CountGameAdapter.CountViewHolder>() {
    class CountViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageItem:ImageView = itemView.findViewById(R.id.iv_img_number)
    }

    interface OnItemClickListener {
        //Tạo một phương thức trừu tượng để truyền dữ liệu id
        fun onItemClick(imageId: Int)
    }
    var listener: OnItemClickListener? = null
    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image_number,parent,false)
        return CountViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listImage.size
    }

    override fun onBindViewHolder(holder: CountViewHolder, position: Int) {
        val id = listImage[position]

        holder.imageItem.setImageResource(id)
        holder.imageItem.setTag(id)


        holder.imageItem.setOnClickListener {
            listener?.onItemClick(id)
        }



    }
}