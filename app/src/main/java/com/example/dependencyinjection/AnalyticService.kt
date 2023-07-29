package com.example.dependencyinjection

import android.util.Log

interface AnalyticService {
    fun trackEvent(eventName:String , eventType:String)
}

class MixPanel : AnalyticService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("myLog" , "$eventName - $eventType")
    }
}

class Firebase : AnalyticService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("myLog" , "$eventName - $eventType")
    }
}