package data

class Note(title: String) {

    lateinit var content: String

    fun makeContent(content: String){
        this.content = content
    }

      var title: String = title
        get() = field
        set(value) {
            println("al;fsdkjf")
            if (value.isNotBlank()) field = value
        }
}

val Note.toUpperName: String
    get() = this.title.uppercase()

fun Note.upper(title: String){
    println(title.uppercase())
}