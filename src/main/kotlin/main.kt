

fun main(args: Array<String>){
    val person = Person("David", "Guimaraes")
    // println(person.firstName)   //Property access syntax, which is accessing the property by its name without having to worry about getters and setters
    //We cannot access a protected property outside the class or subclasses of the class which the referred property belongs to

    //person.firstName = "Something Else"     //Throws an error as long as the setter is private for firstName property

    println(person.lastName)

    // public - access from anywhere
    // protected - access only within the class or subclasses
    // private - only within the class
    // internal - only within the package
}