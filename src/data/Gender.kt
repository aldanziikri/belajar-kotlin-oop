package data

enum class Gender {
    LAKI_LAKI,
    PERENMPUAN
}

fun main() {
    val gender: Array<Gender> = Gender.values()

    print(gender.toList())
}