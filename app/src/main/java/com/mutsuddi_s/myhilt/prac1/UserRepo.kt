package com.mutsuddi_s.myhilt.prac1

import android.util.Log
import javax.inject.Inject

private const val TAG = "UserRepo"

interface UserRepo{
    fun saveUser(email: String,password: String)
}

class SqlRepo @Inject constructor() : UserRepo {


    override fun saveUser(email: String, password: String)
    {
       // Log.d(TAG, "User saved in db ")
        Log.d(TAG,"User saved in db ")
    }
}

class FirebaseRepo: UserRepo {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in firebase ")
    }
}