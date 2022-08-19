package com.example.revisionapp

import android.util.Log

class Driver(var name:String, credit :Int) {// primary constructor of the class

    private var totalCredit= 50

private val gari= Car()


    init {
        totalCredit = totalCredit+ credit

  gari.maxSpeed= 60906
  gari.start()
//
   }
fun showDetails(){
    //Log.i("MyTag", "name of the driver is $driverName")
    Log.i("MyTag", "name of the driver is $name with $totalCredit credit")
}
}