
fun main()
{
    //Construya un diagrama de flujo tal que dado como datos
    //la categoría y el sueldo de un trabajador,
    //calcule el aumento correspondiente
    //teniendo en cuenta la siguiente
    //tabla. Imprima la categoría del trabajador
    //y su nuevo sueldo.

    //CATEGORIA AUMENTO
    //1- 15%
    //2- 10%
    //3- 8%
    //4- 7%

    //Asignación de valores a variables a emplear
    println("Introduce nombre del trabajador:")
    var nombre = readLine().toString()

    println("Introduce categoria:")
    var categoria = readLine()!!.toInt()

    println("Introduce sueldo:")
    var sueldo =  readLine()!!.toDouble()

    //Variable donde se almacenara el nuevo sueldo...
    var nvoSueldo : Double = 0.0

    //EStructura condicional When, en la cual se evaluara la categoria mencionada
    when{
        categoria == 1 ->{ nvoSueldo = sueldo * 1.15 }
        categoria == 2 ->{ nvoSueldo = sueldo * 1.10 }
        categoria == 3 ->{ nvoSueldo = sueldo * 1.08 }
        categoria == 4 ->{ nvoSueldo = sueldo * 1.07 }
        else -> println("No existe la categoria")
    }

  //Impresion de la salida : resultado
    println("Nombre del trabajador: ${nombre}")
    println("Sueldo anterior: ${sueldo}")
    println("Categoria del trabajador: ${categoria}")
    println("Nuevo sueldo con aumento: ${nvoSueldo}")
}