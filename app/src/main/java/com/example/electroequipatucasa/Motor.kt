package com.example.electroequipatucasa

import android.text.BoringLayout

class Motor {

    var encendido:Boolean=false


    constructor(encendido:Boolean){
        this.encendido=encendido
    }

    fun encenderMotor(encendido : Boolean){
        this.encendido=true
        println("El motor está encendido")
    }

}