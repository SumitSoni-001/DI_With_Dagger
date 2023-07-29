package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class UserModule {

    @Named("sql")
    @Binds
    abstract fun getSqlUser(sqlUser: SqlUser) : UserService
//    {
//        return sqlUser
//    }

    @Named("firebase")
    @Binds
    abstract fun getFirebaseUser(firebaseUser: FirebaseUser) : UserService
//    {
//        return FirebaseUser()
//    }

}