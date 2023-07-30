package com.tuminh.kidfunny.view.story

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tuminh.kidfunny.databinding.ActivityStoryDetailPageBinding

class ActivityStoryDetailPage : AppCompatActivity() {
    private lateinit var binding:ActivityStoryDetailPageBinding
    private var title =""
    private var description = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoryDetailPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initData()
        setEventHandler()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.parseColor("#EB266D")
        }
    }

    private fun setEventHandler() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }

    private fun initData() {

        val intent = intent
        title = intent.getStringExtra("STORY_NAME").toString()
        description = intent.getStringExtra("STORY_DESCRIPTION").toString()

        binding.tvHeaderTitle.setText("")
        binding.tvTitle.setText(title)
        binding.tvDescription.setText(description)

    }
}