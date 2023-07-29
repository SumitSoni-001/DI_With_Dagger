package com.example.dependencyinjection

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor (
    @Named("firebase") private val userService: UserService,
    @Named("email") private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        userService.saveUser(email, password)
        notificationService.sendNotification(email)
    }

}