

fun main(args: Array<String>){
    val interestingThings = arrayOf("Programming", "Kotlin", "Java", "C#")

    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    /*
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
    */

    // interestingThings.forEach { println(it) }

    /*
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }
    */

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
}