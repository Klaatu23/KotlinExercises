
fun costoEnfermedad(tipo: Int, dias :Int):Int
{
   var costoPaciente = 0
    when(tipo){
        1-> costoPaciente = dias * 25
        2-> costoPaciente = dias * 16
        3-> costoPaciente = dias * 20
        4-> costoPaciente = dias * 32
        else-> println("No existe el tipo de enfermedad...") }
   return costoPaciente
}

fun calculaDescuento(edad :Int, costo :Int):Float
{
    var descuento =0.0f
    val inicio = 14
    val fin = 22
    val rangoEdad = inicio..fin
    if(edad in rangoEdad)
        descuento = (costo * .10).toFloat()
    return descuento
}

fun main()
{
    println("Introduce tipo de enfermedad:")
    val tipo = readLine()!!.toInt()
    println("Introduce dias internados:")
    val dias = readLine()!!.toInt()
    val costo = costoEnfermedad(tipo,dias)
    when(costo){
        0-> println("No se efectuara transacción...")
        else-> { println("Introduce edad:")
                val edad = readLine()!!.toInt()
                val costoFinal = costo - calculaDescuento(edad,costo)
                println("El costo total final con descuento : ${costoFinal}")}
    }
}