package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun sendNotification(email: String)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun sendNotification(email: String) {
        Log.d("myLog", "Mail sent successfully to $email")
    }
}

@ActivityScope
class MessageService @Inject constructor() : NotificationService {
    override fun sendNotification(phoneNum: String) {
        Log.d("myLog", "Mail sent successfully to $phoneNum")
    }
}