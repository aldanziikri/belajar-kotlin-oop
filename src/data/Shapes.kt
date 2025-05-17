package data

open class Shapes {
    open val corner: Int = 0
}
class Kotak : Shapes() {
    override val corner:Int = 4
}class Segitiga : Shapes() {
    override val corner:Int = 3
}