package com.example.electroequipatucasa

fun main(){

    var heladera1=Heladera()
    var motor1=Motor(false)
    var motor2=Motor(true)

    var lavarropa1=Lavarropa("LG",2012,motor2,"Frontal",25000)

    println("Ingresar datos de la heladera: ")
    println("¿Cuantas puertas tiene?")
    heladera1.nroPuertas= readLine()?.toIntOrNull()!!
    println("¿Que marca es?")
    heladera1.marca=readLine().toString()
    println("¿Cual es el año?")
    heladera1.anio= readLine()?.toIntOrNull()!!
    println("----------------------------------------------")


    var venta1=VentaElectro(0,0.0, heladera1,lavarropa1)
    var venta2=VentaElectro(0,0.0,heladera1,lavarropa1)
    var venta3=VentaElectro(0,0.0,heladera1,lavarropa1)

    println(heladera1.toString())
    heladera1.ProbarMotor()
    heladera1.EstablecerGarantia()
    println("----------------------------------------------")
    println(lavarropa1.toString())
    lavarropa1.ProbarMotor()
    lavarropa1.EstablecerGarantia()
    println("----------------------------------------------")
    println("Opciones de venta: ")
    println("Precio final venta:")
    println("${venta1.calcularPromo(1,50000.00)}")
    println("Precio final promo efectivo 10% de descuento:")
    println("${venta2.calcularPromo(2,50000.00,"efectivo")}")
    println("Precio venta promo efectivo 20% de descuento + flete bonificado:")
    println("${venta3.calcularPromo(3,50000.00,"efectivo","Flete incluido")}")


}