

fun main(args: Array<String>){
    //var greeting: String? = "Hello"
    var greeting: String? = null

    /*
    if(greeting != null){
        print("$greeting ${args[0]}")
    } else{
        print("Hi, ${args[0]}")
    }
    */

    /*
    when(greeting){
        null -> print("Hi, ${args[0]}")
        else -> print("$greeting ${args[0]}")
    }
    */

    // if(greeting == null) print("Hi, ${args[0]}") else print("$greeting ${args[0]}")

    /*
    greeting = "Hello"
    var greetingToBePrinted = greeting ?: "Hi"
    print("$greetingToBePrinted ${args[0]}")
    */

    /*
    var greetingToBePrinted = if(greeting != null) greeting else "Hi"
    println("$greetingToBePrinted ${args[0]}")
    */

    greeting = "Hello"
    var greetingToBePrinted = when(greeting){
        null -> "Hi"
        else -> greeting
    }

    println("$greetingToBePrinted ${args[0]}")
}