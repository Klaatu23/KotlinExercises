fun main()
{
    //Variables a utilizar
    var materiaAprobado:Int = 0
    var materiaReprobado:Int = 0
    var totalPagar:Double = 0.0
    var descuento:Double = 0.0
    //Declaracion del contador
    var contador =1
    //Estructura ciclica
    while (contador<=10)
    {
        println("Introduce materia ${contador}")
        var materia = readLine()!!.toInt()
        if(materia>=8)
        {
            materiaAprobado++
        }
        else
        {
            materiaReprobado++
        }
        contador++
    }
    totalPagar = materiaReprobado * 75.00
    println("Materias reprobadas: ${materiaReprobado}")
    println("Materias Aprobadas: ${materiaAprobado}")
    if(materiaReprobado>=4)
    {
        println("No puedes inscribirte...")
    }
    else
    {
        descuento = totalPagar * .10
        totalPagar = totalPagar - descuento
    }
    println("Total a pagar por materias reprobadas: ${totalPagar}")
}