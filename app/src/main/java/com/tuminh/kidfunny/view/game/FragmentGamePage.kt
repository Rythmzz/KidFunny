package com.tuminh.kidfunny.view.game

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tuminh.kidfunny.R
import com.tuminh.kidfunny.databinding.FragmentGamePageBinding

class FragmentGamePage:Fragment() {
    private lateinit var binding:FragmentGamePageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGamePageBinding.inflate(inflater,container,false)
        setEventHandler()
        return binding.root
    }

    private fun setEventHandler() {
        binding.ivBack.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_home_dest_to_fragment_game_dest)
        }
        binding.lnLayoutGameCount.setOnClickListener {
            val intent = Intent(activity,ActivityCountGamePage::class.java)
            startActivity(intent)
        }
        binding.lnLayoutGameAlpha.setOnClickListener {
            val intent = Intent(activity,ActivityAlphabetPage::class.java)
            startActivity(intent)
        }
    }
}