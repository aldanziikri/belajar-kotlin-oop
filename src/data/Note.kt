package data

class Note(title: String) {
     var title: String = title
        get() = field
        set(value) {
            println("al;fsdkjf")
            if (value.isNotBlank()) field = value
        }
}