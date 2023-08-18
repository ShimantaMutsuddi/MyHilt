package com.mutsuddi_s.myhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserAplication: Application() {

   /* @Inject
    lateinit var userRepo: UserRepo*/

    override fun onCreate() {
        super.onCreate()

       // userRepo.saveUser("mutsuddi005@gmail.com","123456 ")
    }
}