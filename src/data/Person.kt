package data.Person

class Person(firstname: String = "Tidak ada nama", lastname: String = "") {

    var fistName: String = firstname
    var middleName: String = ""
    var lastName: String = lastname

    constructor(firstName: String, midName:String, lastName:String) : this(firstName, lastName) {
        middleName = midName
    }
}

