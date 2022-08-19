package com.example.revisionapp

import Names.callOutMyName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val car =Car()
//        car.start()
//        car.maxSpeed= 565758768

//        val driver = Driver("Kin", 37)
//        driver.showDetails()
//var my= MyCar()
//my.maxSpeed= 156
//
//        my.start()
 val jina = callOutMyName()
        jina.firstName ="Felix"

        jina.whispherMyName()


    }

}