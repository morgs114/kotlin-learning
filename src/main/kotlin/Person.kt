class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val nickname: String? = null // optional parameter
) {

    init {
        println("Successfully added a new person: $firstName $lastName.")
    }

    fun printInfo() {
        println("$firstName $lastName is $age years old${ if (nickname != null) ", and is also known as $nickname" else "." }")
    }
}