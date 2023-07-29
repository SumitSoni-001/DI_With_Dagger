package com.example.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationModule {

    @Named("email")
    @Provides
    @ActivityScope
    fun getEmailService() : NotificationService{
        return EmailService()
    }

    @Named("message")
    @Provides
    @ActivityScope
    fun getMessageService() : NotificationService{
        return MessageService()
    }

}