

fun main(args: Array<String>){
    val person = Person("David", "Guimaraes")
    println(person.firstName)   //Property access syntax, which is accessing the property by its name without having to worry about getters and setters

    //person.firstName = "Something Else"     //Throws an error as long as the setter is private for firstName property
}