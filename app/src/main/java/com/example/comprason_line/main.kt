package com.example.comprason_line

import kotlin.contracts.Returns

/* for ( item in collection )
 Para  - Cada Elemento - Dentro - De una coleccion

{

Hacer estoo
}

 */
// Este algoritmo permite hacer compras ONL-LINE para almacen "La MEJOR"

// Acumulador : Acumula contidades y aumenta su valor de forma desordenada
// Contador :Autenta El valor segun la secuencia definida

fun main (){

    Menu()

}



fun Menu () {
    var Compras = 0
    var Productos = ""
    var Subtotal = 0.0
    var precio = 0.0
    var Iva = 0.0
    var TotalC = 0.0
    var cantidad = 0
    var prod = ""
    var Pri_Nomb = ""
    var Seg_Nomb = ""
    var Pri_Apell = ""
    var Seg_Apell = ""
    var Cedula = 0
    var Direccion = ""
    var Complemento = ""
    var OrdenConf = 0
    var ContTotalU = 0
    var ContTotalP = ""
    var ContSub = 0.0
    var ContIva = 0.0
    var ContTotal = 0.0
    var Confi1 = 0



    println("##### Bienvenido a (( ONLINE STORE)) ######## ")
    println("¿Cuantas compras desea realizar? ")
    println("Digite la opciòn mayor que 1 de lo contrario el programa se cerrara ")
    Compras = readLine()!!.toInt()

    println("*************************************************************")

    while (Compras >= 1) {
        for (Com in 1..Compras) {
            // De uno en uno asta el numero de compras indicado por el usuario

            println("Por favor ingrese el nombre del producto numero $Com:")
            Productos = readLine()!!.toString()
            prod = prod + " \n " + Productos
            println("*************************************************************")
            println("Por favor ingrese el precio de $Productos: ")
            precio = readLine()!!.toDouble()
            ContTotalP = ContTotalP + " \t " + precio
            println("**************************************************************")
            println("Por favor ingrese cuantas unidades de $Productos: ")
            cantidad = readLine()!!.toInt()

            Subtotal = cantidad * precio
            ContSub = ContSub + Subtotal
            Iva = Subtotal * 0.19
            ContIva = ContIva + Iva
            TotalC = ContSub + ContIva
            ContTotal = ContTotal + TotalC
            ContTotalU = ContTotalU + cantidad


            // TotalC = TotalC + Valor
            // TotalC += Valor

            println("==============================================================")
        }
        println("¿ Desea confirmar la orden? ")
        println("1. Si ")
        println("2. No ")
        OrdenConf = readLine()!!.toInt()



        if (OrdenConf == 1) {
            println("==========================================================")
            println("Por favor ingrese los siguientes datos:")
            println("Primer nombre:")
            Pri_Nomb = readLine()!!.toString()
            println("**********************************************************")
            println("Segundo nombre:")
            Seg_Nomb = readLine()!!.toString()
            println("**********************************************************")
            println("Primer apellido:")
            Pri_Apell = readLine()!!.toString()
            println("**********************************************************")
            println("Segundo apellido:")
            Seg_Apell = readLine()!!.toString()
            println("**********************************************************")
            println("Número de identificación:")
            Cedula = readLine()!!.toInt()
            println("**********************************************************")
            println("Direcciòn de residencia:")
            Direccion = readLine()!!.toString()
            println("**********************************************************")
            println("Complemento de la direcciòn: ")
            Complemento = readLine()!!.toString()

        } else if (OrdenConf < 1 || OrdenConf >= 2) {

            println("/// Ingrese nuevamente la orden que desea /////")
            println("==========================================================")
            Menu();
        }

        println("==============================================================")
        println("=================== INICIO FACTURA ===========================")




        println(
            Factura(
                "Online Store S.A.S",
                "1020303480",
                "Bogota DC - Carrera 121D # 128-61",
                " 549 89 37 ",
                "onlinestore@gmail.com",
                "13/04/2022",
                "1"
            )
        )

        println(DatosC(Pri_Nomb, Seg_Nomb, Pri_Apell, Seg_Apell, Cedula, Direccion, Complemento))

        println(Compra(prod, ContTotalP))

        println(Valores(ContSub, ContIva, TotalC, ContTotalU))


        //println(DerechoA())

    }

    while (Compras <= 0) {
        println(" /// La Cantidad de compras es incorrecta //// ")
        println("¿Esta seguro de salir?")
        println("1.No ")
        println("2.Si ")
        Confi1 = readLine()!!.toInt()

        if (Confi1 == 1) {

            Menu();
        }
        else if (Confi1 == 2) {

            println("==============================================================")
            println("                 FIN  Del Programa             ")
            println("==============================================================")
            println("Programa realizado por jonathan  cordoba")
            println("fecha 12/04/2023")
            println("contacto jonathan.jc633@gmail.com")




        }
    }

}

fun Factura (N_Empresa: String,Nit:String,Direccion: String,Telefon:String,Email:String,FechaC:String,NumeroF:String): String {


var Mesaje = " \n \n              $N_Empresa       \n  " +
        "\n" +
        "                 (░░░██)▄▄▄▄▄▄▃ _ _ _ _ _   \n" +
        "                ▂▄▅█████▅▄▃▂\n" +
        "              (█████████████)\n" +
        "                ◥⊙▲⊙▲⊙▲⊙▲⊙◤       \n" +
        "\n"  +
        "             NIT: $Nit            \n  " +
        "       $Direccion        \n  " +
        "           Tel:$Telefon        \n  " +
        "        Email: $Email           \n  " +
        "       Fecha de autorizacion : $FechaC          \n  " +
        "          Numero de la Factura $NumeroF \n " +
        "=============================================================="


    return "$Mesaje"

}

fun DatosC (Pri_Nomb:String,Seg_Nomb:String,Pri_Apell:String,Seg_Apell:String, Cedula:Int,Direccion:String, Complemento:String): String {


    var DatosP ="  // Datos del cliente // \n Nombre: $Pri_Nomb $Seg_Nomb $Pri_Apell $Seg_Apell \n Cedula: $Cedula \n Direccion: $Direccion \n Complemento: $Complemento \n" +
            "=============================================================="

          return "$DatosP"

}

fun Compra(prod:String,ContTotalP:String): String{

    var Productos = "──────────────────────────────────────────────────────────── \n" +
            "            Articulos                      Valor       \n" +
            "            $prod,                 $ContTotalP   \n   "+
            "────────────────────────────────────────────────────────────"

    return "$Productos"



}

fun Valores(ContSub:Double,ContIva:Double,ContTotal:Double,ContTotalU:Int) {

    println("---------------------------------------------------------------")
    println("                        Catidad de compras $ContTotalU ")
    println("                           SUBTOTAL   $ContSub")
    println( " ----------------->  Mas el iva del 19% <---------------")
    println("                            IVA         $ContIva")
    println("                            TOTAL:      $ContTotal")
    println("---------------------------------------------------------------")
    println("              ¡¡¡ Gracias Por Su Compra!!!                   " +
            "\n")
    println("""                      ¯\_(ツ)_/¯                               """)

    println("==============================================================")
    println("Programa realizado por jonathan  cordoba")
    println("fecha 12/04/2023")
    println("contacto jonathan.jc633@gmail.com")

    println("==============================================================")
    println(     "                 FIN              "                   )
    println("==============================================================")

}

/*fun DerechoA(){

    println("==============================================================")
    println("Programa realizado por jonathan  cordoba")
    println("fecha 12/04/2023")
    println("contacto jonathan.jc633@gmail.com")

    println("==============================================================")
    println(     "                 FIN              "                   )
    println("==============================================================")
}*/