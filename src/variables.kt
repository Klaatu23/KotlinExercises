interface Figura{

    fun calcularArea()
    fun imprimirArea()

}

interface Color{

    fun asignarColor(color : String)
    fun obtenerColor():String
}


class Triangulo (val base : Int , val altura : Int ):Figura , Color
{
    var area : Int =0
    var color : String = ""
    override fun calcularArea() {
        area = (base * altura)/2
    }

    override fun imprimirArea() {
        println("Area del Triangulo : $area")
    }

    override fun asignarColor(color: String) {
        this.color = color
    }

    override fun obtenerColor(): String {
        return  color
    }
}

class Cuadrado(val lado : Int):Figura
{
  var area : Int = 0
    override fun calcularArea() {
        area = lado * lado
    }

    override fun imprimirArea() {
        println("Area del Cuadrado : $area")
    }


}

class Rectangulo(val base : Int , val altura : Int):Figura
{
    var area : Int = 0
    override fun calcularArea() {
        area = base * altura
    }

    override fun imprimirArea() {
        println("Area del Rectangulo : $area")
    }


}


fun main(){

    val Triangulito = Triangulo(5,6)
    Triangulito.calcularArea()
    Triangulito.imprimirArea()
    Triangulito.asignarColor("Azul")
    println(Triangulito.obtenerColor())

    val Cuadradito = Cuadrado(4)
    Cuadradito.calcularArea()
    Cuadradito.imprimirArea()

    val Rectangulito = Rectangulo(7,6)
    Rectangulito.calcularArea()
    Rectangulito.imprimirArea()

}