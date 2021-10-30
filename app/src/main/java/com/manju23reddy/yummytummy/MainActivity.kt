package com.manju23reddy.yummytummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Handle the splash screen transition.
        setTheme(R.style.Theme_YummyTummy)
        setContentView(R.layout.activity_main)

    }
}