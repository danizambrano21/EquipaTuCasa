package com.example.electroequipatucasa

class Lavarropa():Electro(marca="",anio=0, motor = Motor(false)) {

    var tipoCarga:String=""
    var volumenCarga:Int=0

    constructor(marca:String,anio:Int,motor : Motor,tipoCarga:String,volumenCarga:Int) : this(){
        this.marca=marca
        this.anio=anio
        this.motor=motor
        this.tipoCarga=tipoCarga
        this.volumenCarga=volumenCarga
    }

    override fun toString() : String {
        return "Información del Lavarropa:" +
                "\nMarca=${this.marca}, " +
                "\nAño=${this.anio}, " +
                "\nTipo de carga=${this.tipoCarga}" +
                "\nVolumen de la carga=${this.volumenCarga}"
    }

    override fun ProbarMotor() {
        motor.encenderMotor(true)
        println("El motor del lavarropas se encuentra en condiciones")
    }

    override fun EstablecerGarantia() {
        super.EstablecerGarantia()
    }
}