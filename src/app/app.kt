package app

import data.Person.Kelas
import data.Person.Person
import data.Person.Siswa


fun main() {
    val aldan = Person("aldan")
        aldan.sayHello("zuma")

    val siswa = Siswa("goku")
    siswa.sayHello("zumaaa")
//    println(siswa.nametwo)
    println(siswa.name)
    val kelas = Kelas("XI PPLG")
    println(kelas.kelas)
    println(kelas.name)
    println(siswa.sayHello("intan"))
    println(kelas.sayHello("XI PPLG 12"))
}
