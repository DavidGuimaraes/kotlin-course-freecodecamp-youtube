
fun getGreeting(name: String = "Stranger"): String {
    return "Hello, $name!"
}

// fun sayHello(name: String) = println(getGreeting(name))
fun sayHello(name: String) = println(getGreeting())

fun main(args: Array<String>){
    sayHello(args[0])
}