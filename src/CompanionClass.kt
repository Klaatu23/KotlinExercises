class CompanionClass {

    companion object{
        fun Saludar()= println("Hola a todos...")
    }

}


class Matematika{

    companion object{
        val pi = 3.1416
    }
}

fun main(){

    CompanionClass.Saludar()

    var PI = Matematika.pi * 2
    println(PI)
    println(Matematika.pi)
}