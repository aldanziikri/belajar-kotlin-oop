package data

open class Shapes {
    open val corner: Int = -2
    open fun sayHello() {
        println("Hello ${this.corner}.")
    }
}
class Kotak : Shapes() {
    override val corner:Int = 4
    val thisCorner:Int = this.corner
    val parentCorner:Int = super.corner

    override fun sayHello() {
        println("Hello $corner. kotak")
        super.sayHello()
    }

}
class Segitiga : Shapes() {
    override val corner:Int = 3
}