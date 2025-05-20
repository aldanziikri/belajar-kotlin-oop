package app

import data.Kotak
import data.Note
import data.Person.Kelas
import data.Person.Person
import data.Person.Siswa
import data.Premium
import data.Segitiga
import data.Shapes
import data.Standart
import data.toUpperName
import data.upper


fun main() {
//    val aldan = Person("aldan")
//        aldan.sayHello("zuma")
//
//    val siswa = Siswa("goku")
//    siswa.sayHello("zumaaa")
////    println(siswa.nametwo)
//    println(siswa.name)
//    val kelas = Kelas("XI PPLG")
//    println(kelas.kelas)
//    println(kelas.name)
//    println(siswa.sayHello("intan"))
//    println(kelas.sayHello("XI PPLG 12"))

//    val shape = Shapes()
//    val kotak = Kotak()
//    val segitiga = Segitiga()
//
//    println(kotak.corner)
//    kotak.sayHello()


//    val cusPremium = Premium("aldan", 17)
//    val cusStandart = Standart("zumaa", 18)
//    println(cusPremium.name)
//    println(cusStandart.name)

//    val note = Note("belajar setter dan getter")
//    println(note.title);


    val note = Note("belajar lateinit");
    note.upper("belajar");
    println(note.toUpperName)
//    note.makeContent("belajar lateinit")
//    println(note.content)
}
