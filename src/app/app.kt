package app

import data.Person.Person


fun main() {
val aldan = Person("aldan", "zikriiiii")
    aldan.sayHello()
    aldan.sayHello(aldan.firstname+ " "+aldan.lastname)
}