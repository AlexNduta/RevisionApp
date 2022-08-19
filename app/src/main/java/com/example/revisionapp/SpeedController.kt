package com.example.revisionapp

interface SpeedController {

    fun accelerate()
    fun decelerate()


    fun getBarndId():String{
        return "ADS2344"
    }
}