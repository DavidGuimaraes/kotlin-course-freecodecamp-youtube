

fun main(args: Array<String>){
    // val interestingThings = arrayOf("Programming", "Kotlin", "Java", "C#")

    // println(interestingThings.size)
    // println(interestingThings[0])
    // println(interestingThings.get(0))

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

    /*
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
    */

    /*
    val interestingThings = listOf("Programming", "Kotlin", "Java", "Java", "C#")

    println(interestingThings.size)                             //5
    println(interestingThings[0])                               //Programming
    println(interestingThings.get(0))                           //Programming
    println(interestingThings.indexOf("Kotlin"))                //1
    //println(interestingThings.listIterator())
    //val iterator = interestingThings.listIterator()
    println(interestingThings.lastIndexOf("Java"))      //3
    println(interestingThings.subList(1, 4))                    //[Kotlin, Java, Java]
    println(interestingThings.last())                           //C#
    //println(interestingThings.listIterator(0))
    //interestingThings.listIterator(0)
    */

    val interestingProgrammingLanguages = mapOf(1 to "Java", 2 to "C#", 3 to "Kotlin", 4 to "Clojure", 5 to "Elixir")

    //interestingProgrammingLanguages.forEach { key, value -> println("$key -> $value")}
    interestingProgrammingLanguages.forEach { (key, value) -> println("$key -> $value")}

    println(interestingProgrammingLanguages.get(1))                     //Java
    println(interestingProgrammingLanguages[2])                         //C#
    println(interestingProgrammingLanguages.entries)                    //[1=Java, 2=C#, 3=Kotlin, 4=Clojure, 5=Elixir]
    println(interestingProgrammingLanguages.keys)                       //[1, 2, 3, 4, 5]
    println(interestingProgrammingLanguages.values)                     //[Java, C#, Kotlin, Clojure, Elixir]
    println(interestingProgrammingLanguages.containsKey(0))             //false
    println(interestingProgrammingLanguages.containsValue("PHP"))       //false
    println(interestingProgrammingLanguages.isNotEmpty())               //true
    println(interestingProgrammingLanguages.isNullOrEmpty())            //false

    println(interestingProgrammingLanguages.get(1))
    println(interestingProgrammingLanguages[2])
    println(interestingProgrammingLanguages.entries)
    println(interestingProgrammingLanguages.keys)
    println(interestingProgrammingLanguages.values)
    println(interestingProgrammingLanguages.containsKey(0))
    println(interestingProgrammingLanguages.containsValue("PHP"))
    println(interestingProgrammingLanguages.isNotEmpty())
    println(interestingProgrammingLanguages.isNullOrEmpty())

}