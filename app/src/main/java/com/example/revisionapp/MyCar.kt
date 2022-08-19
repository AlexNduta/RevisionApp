package com.example.revisionapp

import android.util.Log

 class MyCar: Car() , SpeedController{
    override fun start(){
        Log.i("MyTag", "my new is going on........The brand id id ${getBarndId()}")
    }

    override fun accelerate() {
        Log.i("MYTAG", "this the accelator method.... ")
    }

    override fun decelerate() {
        Log.i("MYTAG", "this id the decelerate method")
    }
}