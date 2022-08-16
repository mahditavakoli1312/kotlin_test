import java.util.StringJoiner

open class Student (name : String, phNumber : String) {

    var rule = ""
    constructor(a : Pair<String,String> , rule : String) : this (a.first,a.second){
        this.rule = rule
    }
    var name = name
        get() = "name is $field"
        set(value) {
            field = value
        }

    var phNumber = phNumber
        get() = "phoneNumbe is $field"

    override fun toString(): String {
        return """
            
            
            -----------------------------------------
            name        : $name
            phoneNumber : $phNumber
            rule        : $rule
            -----------------------------------------
        """.trimIndent()
    }
}
class KarshnaCStrident (name : String , phNumber: String) : Student(name= name , phNumber= phNumber){

    // question : if init run after constructor so why val can assign in init and dont can in constructor
    private val accessLevel : Int
    constructor( a : Pair<String , String> , rule : String) : this(name= a.first , phNumber= a.second) {
        this.rule = "Karshnesi"
//        accessLevel = 0
    }
    init {
        accessLevel = 0
    }

    override fun toString(): String {
        return """
            
          
            KARSHNAC
            -----------------------------------------
            name        : $name
            phoneNumber : $phNumber
            rule        : $rule
            -----------------------------------------
        """.trimIndent()
    }

}

fun main() {
    val student = Student(name =  "mahdi", phNumber = "09154720469")
    println(student)
    val student2 = Student(Pair("mahdi","09391863362"),"karshenaC")
    println(student2)
    val student3 = KarshnaCStrident(Pair("reza","09153016382"),"NOTING")
    println(student3)

    val lambda_fun = { x:Int , y:Int ->
        println("\n\n-----------start lambda-----------")
        println((x + y))
        println("enter a statement ->")
        var input :String = readln()
        while (input !="Finish"){
            when {
                input == "Hi" -> println("Hi!")
                input == "How are you" -> println("Fine!")
                input == "where are you" -> println("In Your Mind!")

            }
            input = readln()
        }

        println("-----------finish lambda----------\n\n")
    }

    lambda_fun(2,3)
}