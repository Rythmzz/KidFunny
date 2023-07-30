package com.tuminh.kidfunny.view.game

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tuminh.kidfunny.adapter.AlphabetGameAdapter
import com.tuminh.kidfunny.adapter.CountGameAdapter
import com.tuminh.kidfunny.application.MyApplication
import com.tuminh.kidfunny.databinding.ActivityAlphabetPageBinding

class ActivityAlphabetPage:AppCompatActivity(), AlphabetGameAdapter.OnItemClickListener {
    private lateinit var binding:ActivityAlphabetPageBinding
    private lateinit var adapter:AlphabetGameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlphabetPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.parseColor("#EB266D")
        }
        setRecyclerView()
        setEventHandler()
    }

    private fun setEventHandler() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }

    private fun setRecyclerView() {
        adapter = AlphabetGameAdapter(MyApplication().listAlphabet)

        binding.rcvListAlphabet.adapter = adapter

        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL

        binding.rcvListAlphabet.layoutManager = linearLayoutManager

        adapter.setOnItemClickListener(this)


    }

    override fun onItemClick(imageId: Int) {
        binding.ivImgAlphabetDetail.setImageResource(imageId)
        binding.ivImgAlphabetDetail.setTag(imageId)
    }
}