package data

open class Customer(val name: String, val type: String, val age: Int) {

}
class Standart : Customer{
    constructor(name: String, age: Int) : super(name,"Standart", age)
}class Premium : Customer{
    constructor(name: String, age: Int) : super(name,"Premium", age)
}