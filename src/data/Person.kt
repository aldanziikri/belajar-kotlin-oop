package data.Person

class Person(var name: String = "Tidak ada nama") {

    fun sayHello() {
        println("Hello ${this.name}")
    }
    fun sayHello(name:String) {
        println("Hello $name, nama saya ${this.name}")
    }
}

