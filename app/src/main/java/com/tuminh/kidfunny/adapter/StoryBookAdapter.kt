package com.tuminh.kidfunny.adapter

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
import com.tuminh.kidfunny.model.Story
import com.tuminh.kidfunny.view.story.ActivityStoryDetailPage

class StoryBookAdapter(val listStory:ArrayList<Story>) : RecyclerView.Adapter<StoryBookAdapter.StoryBookViewHolder>() {
 class StoryBookViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val imageStory:ImageView = itemView.findViewById(R.id.iv_img_story)
     val titleStory:TextView = itemView.findViewById(R.id.tv_title_story)
     val layoutStory:LinearLayout = itemView.findViewById(R.id.ln_layout_story)
 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryBookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story,parent,false)
        return StoryBookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listStory.size
    }

    override fun onBindViewHolder(holder: StoryBookViewHolder, position: Int) {
        val storyCurrent = listStory[position]

        Glide.with(holder.itemView.context).load(storyCurrent.image).into(holder.imageStory)

        holder.titleStory.setText(storyCurrent.title)

        holder.layoutStory.setOnClickListener {
            val data:Bundle = Bundle()
            data.putString("STORY_NAME",storyCurrent.title)
            data.putString("STORY_DESCRIPTION",storyCurrent.description)

            val intent = Intent(holder.itemView.context,ActivityStoryDetailPage::class.java)
            intent.putExtras(data)
            holder.itemView.context.startActivity(intent)
        }



    }

}