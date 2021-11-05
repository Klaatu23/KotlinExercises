fun main()
{
   //Obtención del total de gastos empleando variables boolean
    var fin : Boolean = true
    var totalGasto : Float = 0.0f
    while(fin)
    {
        println("Introduce gasto")
        var gasto = readLine()!!.toFloat()
        totalGasto += gasto
        println("Deseas continuar?")
        var respuesta = readLine()!!.toString()
        if(respuesta=="No"||
            respuesta =="no"||
            respuesta=="NO"||
            respuesta=="nO")
            fin = false
    }
    println("El total de gastos es : ${totalGasto}")
}