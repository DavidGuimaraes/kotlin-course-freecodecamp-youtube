/*
class Person {
}
*/

// class Person constructor()       //This is called primary constructor. This is the explicit declaration of a primary constructor

// class Person()                   //This is an implicit declaration of a primary constructor

// class Person                        //Syntax sugar for declaring a class with no properties, which means no primary constructor declaration is necessary

// class Person constructor(firstName: String, lastName: String)

/*
class Person(firstName: String, lastName: String) {
    var firstName: String
    var lastName: String

    init {
        this.firstName = firstName
        this.lastName = lastName
    }
}
*/

/*
class Person(_firstName: String, _lastName: String) {
    var firstName: String
    var lastName: String

    init {
        firstName = _firstName
        lastName = _lastName
    }
}
*/

/*
class Person(_firstName: String, _lastName: String) {
    var firstName: String = _firstName
    var lastName: String = _lastName
}
*/

/*
class Person(val firstName: String, val lastName: String) {

    init {
        println("First init block")                 //This is going to be printed out first
    }

    init {
        println("Second init block")                //This is going to be printed out right after the first one
    }

    constructor(): this("David", "Guimaraes") {     //This is called the second constructor. Printed out after all init blocks
        println("Secondary constructor")
    }
}
*/


class Person(_firstName: String, _lastName: String) {
    var firstName: String = _firstName
        // get() = firstName
        private set(value) {
            field = value
        }

    var lastName = _lastName
        private set(value) {
            field = value
        }
}


// class Person(var _firstName: String, var lastName: String)