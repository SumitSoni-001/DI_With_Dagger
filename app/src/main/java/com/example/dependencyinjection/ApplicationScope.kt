package com.example.dependencyinjection

import android.app.Application

class ApplicationScope : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }

}