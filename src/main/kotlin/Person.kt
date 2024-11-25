class Person(firstName: String, lastName: String, age: Int, nickname: String? = null) {
    val firstName: String = firstName
    val lastName: String = lastName
    val age: Int = age
    val nickname: String? = nickname // nickname optional

    // initialiser block
    init {
        println("Successfully added a new person: $firstName $lastName.")
    }

    fun printInfo() {
        println("$firstName $lastName is $age years old${ if (nickname != null) ", and is also known as $nickname" else "." }")
    }
}