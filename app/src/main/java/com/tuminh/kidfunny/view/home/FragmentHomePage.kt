package com.tuminh.kidfunny.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tuminh.kidfunny.R
import com.tuminh.kidfunny.data.SharedPrefManager
import com.tuminh.kidfunny.databinding.FragmentHomePageBinding

class FragmentHomePage : Fragment() {
    private lateinit var binding:FragmentHomePageBinding
    private lateinit var sharedPrefManager: SharedPrefManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initData()
        setEventHandler()
    }

    private fun initData() {
        sharedPrefManager = SharedPrefManager(activity!!)

        binding.civAvatar.setBackgroundResource(sharedPrefManager.getImageId()!!)
        binding.tvNickName.setText(sharedPrefManager.getNickname())
        binding.tvBorn.setText(sharedPrefManager.getBirthDate())
    }

    private fun setEventHandler() {
        binding.lnLayoutGame.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_home_dest_to_fragment_game_dest,null)
        }
        binding.lnLayoutStory.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_home_dest_to_fragment_story_dest,null)
        }
    }
}