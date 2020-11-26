package com.example.mysplashscreenwithoutactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MySplashScreenWithoutActivity)
        setContentView(R.layout.activity_main)
    }
}