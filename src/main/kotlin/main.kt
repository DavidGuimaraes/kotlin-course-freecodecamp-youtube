
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

class Greet(name: String){
    init {
        print("Hello, $name")
    }
}

fun main(args: Array<String>){
    Greet(args[0])
}