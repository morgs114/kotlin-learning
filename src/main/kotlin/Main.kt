fun main() {
    // Classes and Objects

    /* Animal class is defined in Animal.kt */
    val animal = Animal("Dog", "Woof Woof!")
    animal.makeSound()

    // No parameters given, uses default name 'Animal' and sound 'Animal sound'
    val animal2 = Animal()
    animal2.makeSound()

    /* Person class is defined in Person.kt */
    // person1 without a nickname
    val person1 = Person("John", "Doe", 30)
    person1.printInfo()

    // person2 with a nickname
    val person2 = Person("Annabelle", "Smith", 25, "Annie")
    person2.printInfo()
}