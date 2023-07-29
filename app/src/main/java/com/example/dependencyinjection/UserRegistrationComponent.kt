package com.example.dependencyinjection

import dagger.Component

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [UserModule::class, NotificationModule::class]
)
interface UserRegistrationComponent {

//    fun getUserRegistrationService() : UserRegistrationService

//    fun getNotificationService() : NotificationService

//    fun getEmailService() : EmailService

    fun inject(consumer: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): UserRegistrationComponent
    }

}