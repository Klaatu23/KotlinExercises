import Persona

fun main()
{
  //uso Data Class , metodo toString()
  val Persona1 : Persona = Persona("Fulanito",20, "quien sabe")
  println(Persona1.toString())
   //uso de component
  println(Persona1.component1())
  println(Persona1.component2())
//copia de valores
  val Persona2 :Persona= Persona1.copy(direccion = "quien sabe?")
  println(Persona2.toString())
    val Persona3=Persona("Menganito",22,"desconocido")
//deconstruccion
val(edad,nombre,direccion)=Persona3
  println(Persona3.toString())
}