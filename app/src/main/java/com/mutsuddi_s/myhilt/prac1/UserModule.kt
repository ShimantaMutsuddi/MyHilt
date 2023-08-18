package com.mutsuddi_s.myhilt.prac1

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {


    @Provides
    @Named("sql")
    fun provideSqlRepo(sqlRepo: SqlRepo): UserRepo {
        return sqlRepo

    }
    @Provides
    @Named("firebase")
    fun provideFirebaseRepo(): UserRepo {
        return FirebaseRepo()

    }
}