fun checkNumber(number:Int){
 if(number==0)
 {
     println("Nulo")
 }
 else if(number%2==0)
 {
     println("Par")
 }
 else
 {
  println("Impar")
 }

}

fun main()
{
  println("Introduce numero")
    var number = readLine()!!.toInt()
    checkNumber(number)
}