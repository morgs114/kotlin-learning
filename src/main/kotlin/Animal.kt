class Animal(name: String = "Animal", sound: String = "Animal sound") {
    var animalName: String = name
    var animalSound: String = sound

    // initialising Animal class
    init {
        println("Animal created successfully.")
    }

    fun makeSound() {
        println("$animalName makes sound: $animalSound")
    }
}
