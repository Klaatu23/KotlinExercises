fun main()
{
    println("Introduce usuario:")
    var user = readLine()!!.toString()
    println("Introduce password:")
    var password = readLine()!!.toString()

    if(user.length>=8  && password.length>=8 && !user.equals("") && !password.equals(""))
    {
        print("Bienvenido, se han registrado sus datos... ")
    }
    else
    {
        print("Una de las opciones no cumple con el requisito...")
    }
}