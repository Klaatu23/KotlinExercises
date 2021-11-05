fun mostrarSaludo()
{
    println("Hola a todos, espero tengan un buen fin de semana...")
}

fun mostrarSaludoEsp(msg : String):String
{
    return msg
}

fun imprimeMsg(msg : String){
    println(msg)
}

fun showNumber(nmb:Int)
{
    println(nmb)
}

fun showNumber2(nmb:Int):Int
{
    return nmb
}

fun main()
{
    mostrarSaludo()
    val obtieneMsg = mostrarSaludoEsp("Hey, whats up?")
    println(obtieneMsg)
    println(mostrarSaludoEsp("pruebita..."))
    imprimeMsg("saludos...")
    showNumber(56)
    val numerito = 99
    println(showNumber2(numerito))
}