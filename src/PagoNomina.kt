fun main(){
//Pago nomina utilizando estructura ciclica

    var totalNomina : Float = 0.0f
    println("Introduce valor de n:")
    var n = readLine()!!.toInt()
    for(i in 1..n)
    {
     println("Introduce salario ${i}")
     var salario = readLine()!!.toFloat()

        totalNomina+=salario
    }
    println("Total de nomina a pagar: ${totalNomina}")
}