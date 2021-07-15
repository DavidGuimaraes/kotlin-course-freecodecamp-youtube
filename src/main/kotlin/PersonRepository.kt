interface PersonRepository {

    val something: String   //Interfaces can have properties. Don't know a practical application for this

    //This might solve one of the ISP problems, but the interface itself would still be fat (not in this specific case, just in case of ISP violation)
    fun listAll() {
        //Default implementation. Interface methods can have default implementations. Don't know a practical application for this
    }
    fun getPersonFirstNameById(id: Int)
    fun getPersonLastNameById(id: Int)
}