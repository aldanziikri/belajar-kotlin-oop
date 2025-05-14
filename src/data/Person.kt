package data.Person

class Person(firstname: String = "Tidak ada nama", lastname: String = "") {

    init {
        println("object person bernama $firstname $lastname dibuat")
    }

    var firstName: String =  firstname
    var middleName: String? = null
    var lastName: String = lastname
}

