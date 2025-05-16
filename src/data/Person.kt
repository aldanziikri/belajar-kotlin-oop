package data.Person

class Person(var firstname: String = "Tidak ada nama", var lastname: String = "") {

    fun sayHello() {
        println("Hello $firstname $lastname")
    }
    fun sayHello(name:String) {
        println("Hello $name, ini fun ke 2 say hello")
    }
}

