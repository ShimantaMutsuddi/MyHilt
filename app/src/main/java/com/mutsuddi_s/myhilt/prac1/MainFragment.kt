package com.mutsuddi_s.myhilt.prac1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mutsuddi_s.myhilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {


    @Inject
    @Named("firebase")
    lateinit var userRepo: UserRepo

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        userRepo.saveUser("mutsuddi005@gmail.com","123456 ")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


}