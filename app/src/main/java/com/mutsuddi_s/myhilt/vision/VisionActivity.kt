package com.mutsuddi_s.myhilt.vision

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mutsuddi_s.myhilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class VisionActivity : AppCompatActivity() {
    private  val TAG = "VisionActivity"

    @Inject
    lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vision)
        //val engine=Engine()
        //val car=Car(engine)
        car.startCar()

    }
}

class Car(var engine: Engine)
{
    fun startCar(){
        engine.getStartEngine()
        Log.d(TAG, "getStartCar ")
    }

}

class Engine @Inject constructor(val piston: Piston){
    fun getStartEngine(){
        piston.getStartPistone()
        Log.d(TAG, "getStartEngine ")
    }
}
class Piston(val numberOfPiston: NumberOfPiston){
    fun getStartPistone(){
        numberOfPiston.pistonNumber()
        Log.d(TAG, "getStartPiston ")
    }
}
interface NumberOfPiston{
    fun pistonNumber()
}

class NumberOfPistonImpl: NumberOfPiston{
    override fun pistonNumber() {
        Log.d(TAG, "pistonNumber: 4")
    }
}