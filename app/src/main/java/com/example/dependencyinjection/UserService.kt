package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserService {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SqlUser @Inject constructor(private val analyticService: AnalyticService) : UserService{
    override fun saveUser(email: String, password: String) {
        Log.d("myLog", "User Saved in SQL")
        analyticService.trackEvent("Save user" , "CREATE")
    }
}

@Singleton
class FirebaseUser @Inject constructor(private val analyticService: AnalyticService) : UserService{
    override fun saveUser(email: String, password: String) {
        Log.d("myLog", "User Saved in Firebase")
        analyticService.trackEvent("Save user" , "CREATE")
    }
}
