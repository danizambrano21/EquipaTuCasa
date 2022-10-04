package com.example.electroequipatucasa

import com.google.android.material.bottomnavigation.BottomNavigationItemView

class VentaElectro {

    var cantidad:Int=0
    var precio:Double=0.0
    var medioPago:String=""
    var bonificacionFlete:String=""
    var heladera:Heladera
    var lavarropa:Lavarropa

    constructor(cantidad:Int,precio:Double,heladera1:Heladera,lavarropa1 : Lavarropa){
        this.cantidad=cantidad
        this.precio=precio
        this.heladera=heladera1
        this.lavarropa=lavarropa1
    }

    fun calcularPromo(cantidad : Int,precio : Double):Double{
        return precio*cantidad
    }

    fun calcularPromo(cantidad : Int,precio : Double,medioPago:String):Double{
        var subtotal:Double=0.0
        var descuento:Double=0.0
        if (medioPago=="efectivo"){
            subtotal=precio*cantidad
            descuento=subtotal*0.10
        }
        return subtotal-descuento
    }

    fun calcularPromo(cantidad : Int,precio : Double,medioPago : String,bonificacionFlete:String): Double{
        var subtotal:Double=0.0
        var descuento:Double=0.0
        if (medioPago=="efectivo"){
            subtotal=precio*cantidad
            descuento=subtotal*0.20
        }
        return subtotal-descuento
    }


}