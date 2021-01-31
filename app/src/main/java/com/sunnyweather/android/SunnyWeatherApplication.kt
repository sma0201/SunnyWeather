package com.sunnyweather.android;

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object{

        //Token
        const val TOKEN = "VZSv7Zu6msab97wO"

        //全局Context对象
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext;
    }
}