package com.tuminh.kidfunny.view.game

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tuminh.kidfunny.adapter.CountGameAdapter
import com.tuminh.kidfunny.application.MyApplication
import com.tuminh.kidfunny.databinding.ActivityCountPageBinding

class ActivityCountGamePage:AppCompatActivity(), CountGameAdapter.OnItemClickListener {
    private lateinit var binding:ActivityCountPageBinding
    private lateinit var adapter:CountGameAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountPageBinding.inflate(layoutInflater)
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
        adapter = CountGameAdapter(MyApplication().listNumberCount)

        binding.rcvListNumber.adapter = adapter

        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL

        binding.rcvListNumber.layoutManager = linearLayoutManager

        adapter.setOnItemClickListener(this)


    }

    override fun onItemClick(imageId: Int) {
        binding.ivImgNumberDetail.setImageResource(imageId)
        binding.ivImgNumberDetail.setTag(imageId)
    }
}