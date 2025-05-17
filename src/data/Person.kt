package data.Person

open class Person(var name: String = "Tidak ada nama") {

    fun sayHello(name:String) {
        println("Hello $name, nama saya ${this.name}")
    }
}

class Siswa(name: String) :  Person(name){

}


