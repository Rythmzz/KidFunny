package com.tuminh.kidfunny.view.story

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tuminh.kidfunny.R
import com.tuminh.kidfunny.adapter.StoryBookAdapter
import com.tuminh.kidfunny.application.MyApplication
import com.tuminh.kidfunny.databinding.FragmentStoryPageBinding

class FragmentStoryPage: Fragment() {

    private lateinit var binding:FragmentStoryPageBinding
    private lateinit var adapterStoryVN:StoryBookAdapter
    private lateinit var adapterStoryForeign:StoryBookAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoryPageBinding.inflate(inflater,container,false)
        setEventHandler()
        setRecyclerView()
        return binding.root
    }

    private fun setRecyclerView() {
        adapterStoryVN = StoryBookAdapter(MyApplication().listStoryVN)
        adapterStoryForeign = StoryBookAdapter(MyApplication().listStoryForeign)

        binding.rcvStoryVietnam.adapter = adapterStoryVN

        val linearLayoutManager1:LinearLayoutManager = LinearLayoutManager(activity)
        linearLayoutManager1.orientation = LinearLayoutManager.HORIZONTAL

        binding.rcvStoryVietnam.layoutManager = linearLayoutManager1

        binding.rcvStoryForeign.adapter = adapterStoryForeign

        val linearLayoutManager2:LinearLayoutManager = LinearLayoutManager(activity)
        linearLayoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        binding.rcvStoryForeign.layoutManager = linearLayoutManager2

    }

    private fun setEventHandler() {
        binding.ivBack.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_home_dest_to_fragment_story_dest,null)
        }




    }
}