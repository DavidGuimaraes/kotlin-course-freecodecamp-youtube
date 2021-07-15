
/*
fun printMainProgrammingLanguages(programmingLanguages: List<String>) {
    programmingLanguages.forEach { println(it) }
}
*/

fun printMainProgrammingLanguages(vararg programmingLanguages: String) {
    programmingLanguages.forEach { println(it) }
}

fun main(args: Array<String>){
    val myMainProgrammingLanguages = listOf("Java", "C#", "Kotlin")
    //printMainProgrammingLanguages() //Throws an error as long as the parameter is the type of List<String>
    //printMainProgrammingLanguages(myMainProgrammingLanguages)     //As long as the vararg is used, this does not work
    printMainProgrammingLanguages()   //Does not throw an error anymore, since the 'vararg' is used
    printMainProgrammingLanguages("Clojure", "Scala", "Elixir")     //The vararg treats all these arguments as an array

    val test = arrayOf("One Things", "Another Thing")
    printMainProgrammingLanguages(*test)    //Using the spread operator (*) we can pass an array as parameter, since the vararg treats everything as array
}