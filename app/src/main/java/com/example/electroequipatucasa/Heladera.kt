package com.example.electroequipatucasa

class Heladera():Electro(marca ="", anio =0, motor = Motor(false)) {

    var nroPuertas:Int=0

 constructor(marca:String,anio:Int,motor:Motor,nroPuertas:Int): this(){
     this.marca=marca
     this.anio=anio
     this.motor=motor
     this.nroPuertas=nroPuertas
 }

    override fun toString() : String {
        return "Información de la Heladera:" +
                "\nMarca=${this.marca}, " +
                "\nAño=${this.anio}, " +
                "\nNro. de Puertas=${this.nroPuertas}"
    }

    override fun ProbarMotor() {
        motor.encenderMotor(true)
        println("El motor de la heladera se encuentra en condiciones")
    }

    override fun EstablecerGarantia() {
        super.EstablecerGarantia()
    }
}
