fun PosiNeg(number :Int)
{
    if(number==0)
       print("Neutro")
    else if(number>0)
        print("Positivo")
    else
        print("Negativo")
}

fun main()
{
    println("Introduce numero:")
    var num = readLine()!!.toInt()
    PosiNeg(num)
}