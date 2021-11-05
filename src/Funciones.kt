//Variable global
var storage  : Int = 0

//Funcion donde se ira agregando (suma) del item(s) introducido en la funcion principal
fun addItem(item : Int)
{
    storage = storage + item
    println("Valor de item almacenado: "+storage)
}

//funcion principal
fun main()
{
    //declaración y asignación del contador
    var i = 1
    //estructura ciclica
    while (i<=3)
    {
        //introducción de datos por teclado
        println("Introduce item para almacenar:")
        var item = readLine()!!.toInt()
        //llamado de la funcion addItem
        addItem(item)
        //Incremento del contado
        i++
    }
}