
/*
fun main() {
    print("Hello. World! Again! Fuck!")
}
*/

// fun main() = print("Hello. World! Again! Fuck!")

/*
fun main(args: Array<String>) {
    print("Hello. World! Again! Fuck!")
}
*/

/*
fun main(args: Array<String>) {
    print("Hello. World! Again! Fuck! My name is ${args[0]}")
}
*/

// fun main(args: Array<String>) = print("Hello. World! Again! Fuck! My name is ${args[0]}")

/*
class Greet(name: String){
    init {
        print("Hello, $name")
    }
}
*/

const val name3: String = "Amanda"        //Top level variable
var name4: String? = null                 //The '?' operator is the nullable in Kotlin
/*
    get() {
        TODO()
    }
    set(value) {}
*/

fun main(args: Array<String>){
    val name: String = "David"
    //name = "Something else"     //We get an error here

    var name2: String = "Amanda"
    name2 = "Peter"             //We won't get an error here as long as we use the 'var' keyword instead of 'val'
    val name5 = "Sara"          //Variable of type String declared with inference in Kotlin, which is implicit
    var name6 = null            //In this case, we get a warning and the compiler requests to declare the type explicitly

    println(name)
    println(name2)
    println(name3)
    println(name4)
}