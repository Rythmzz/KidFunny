package com.tuminh.kidfunny.loading

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.tuminh.kidfunny.ActivityMainPage
import com.tuminh.kidfunny.R
import com.tuminh.kidfunny.view.kid.ActivityKidAboutPage

class ActivityLoadingPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_page)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ActivityKidAboutPage::class.java))
            finish()
        },2000)
    }
}