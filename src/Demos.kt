
interface pagoHSM{
    fun calcPayment(pagoHR: Double, numHRs: Int):Double
}
open class Person(var name : String, var age : Int)
{

    open fun printName():String
    {
        return name
    }

    open fun printAge():Int
    {
        return age
    }

}

class Student(career: String, quarter : Int, inscription : Boolean, name: String, age: Int): Person(name, age){
    private var career: String = career
    private var quarter: Int = quarter
    private var inscription: Boolean = inscription

    fun printDataStudent()
    {
        println("----------------")
        println("- Nombre: ${name}")
        println("- Carrera: ${career} ")
        println("- Cuatrimestre: ${quarter} ")
        println("- Activo:  ${inscription}")
        println("----------------")
    }

    fun imprimirSaludo()
    {
        println("Hola a todos...")
    }
}

class Profesor(category: String, salary : Double, name: String, age: Int): Person(name, age),pagoHSM
{

    private var category :String = category
    private var salary: Double = salary

    fun printDataProf()
    {
        println("----------------")
        println("- Nombre del Profesor: ${name}")
        println("- Edad del Profesor: ${age}")
        println("- Categoria del Profesor: ${category}")
        println("- Salario del Profesor: ${salary}")
        println("----------------")
    }

    override fun calcPayment(pagoHR: Double, numHRs: Int): Double {
        if(this.category=="HSM")
        {
            this. salary = pagoHR * numHRs
        }
        return this.salary
    }


}

fun main()
{
    //Introduccion de datos por teclado
    println("Introduzca nombre:")
    var nombre = readLine().toString()
    //Introduccion de dato tipo entero
    println("Introduzca edad:")
    var edad = readLine()!!.toInt()

    //Asignacion y creacion de instancia de clase Person
    val persona1 :Person = Person(nombre,edad)
    println("${persona1.printName()}")
    println("Edad de la persona ${persona1.printAge()}")

    //Asignacion y creacion de instancia de clase Student
    val estudiante1 :Student = Student("DSM",5,true,"Fulanito",20 )
    estudiante1.printDataStudent()

    //Asignacion y creacion de instancia de clase Profesor
    val profesor1 : Profesor = Profesor("PTC",20000.0,"Pepito",40)
    profesor1.printDataProf()

   //Uso de una interface
    val Prof1 :Profesor = Profesor("HSM",0.0,"Mengano",40)
    Prof1.calcPayment(109.99,20)
    Prof1.printDataProf()

}