package data.Person

open class Person(var name: String = "Tidak ada nama") {

    open fun sayHello(name:String) {
        println("Hello $name, nama saya ${this.name}")
    }
}

open class Siswa(name: String) :  Person(name){
    override fun sayHello(name:String) {
        println("Hello $name, nama saya ${this.name} seorang siswa")
    }
}class Kelas(val kelas: String) :  Siswa(kelas){
    override fun sayHello(name:String) {
        println("Hello $name, nama saya ${this.name} seorang siswa kelas ${this.kelas}")
    }
}


