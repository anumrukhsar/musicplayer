package com.application.musicplayer.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import com.application.musicplayer.R
import com.application.musicplayer.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        changeActivityAfterAnimation()

    }

    private fun changeActivityAfterAnimation() {
        //Introduce Delay
        Handler(getMainLooper()).postDelayed({
            changeActivity()
        }, 2000)
    }

    private fun changeActivity() {
        //Go to MainActivity
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}