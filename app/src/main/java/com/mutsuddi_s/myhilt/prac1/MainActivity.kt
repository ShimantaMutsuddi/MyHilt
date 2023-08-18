package com.mutsuddi_s.myhilt.prac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mutsuddi_s.myhilt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    /*@Inject
    lateinit var userRepo: UserRepo*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //userRepo.saveUser("mutsuddi005@gmail.com","123456 ")
    }
}