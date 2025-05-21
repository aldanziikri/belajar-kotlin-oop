package data

interface Action {
    fun action()
}
fun fireAction(action: Action) {
    action.action()
}

fun main(){
    fireAction(object : Action{
        override fun action(){
            println("tembakkk")
        }
    })
}