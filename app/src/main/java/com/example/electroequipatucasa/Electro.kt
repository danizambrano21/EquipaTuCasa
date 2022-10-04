package com.example.electroequipatucasa

open class Electro {
    var marca:String=""
    var anio:Int=0
        set(value) {
            field=value
            if(field<=2000){
                println("Es una nevera antigua ")
            }
        }
    var motor:Motor


    constructor(marca:String,anio:Int,motor : Motor){
        this.marca=marca
        this.anio=anio
        this.motor=motor
    }

    override fun toString() : String {
        return "Información del electrodoméstico:" +
                "\nMarca=${this.marca}, " +
                "\nAño=${this.anio}, "
    }

    open fun ProbarMotor(){
        println("El motor se encuentra ${this.motor.encenderMotor(true)}")
    }

    open fun EstablecerGarantia(){
        println("Garantia de 2 años")
    }





}