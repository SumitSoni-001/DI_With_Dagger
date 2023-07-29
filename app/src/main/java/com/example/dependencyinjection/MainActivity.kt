package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as ApplicationScope).appComponent
        val component = DaggerUserRegistrationComponent.factory().create(appComponent)
        component.inject(this)
        userRegistrationService.registerUser("sumitsoni02468@gmail.com", "123456")

    }
}