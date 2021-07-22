package com.abdul.myfirsttap.basics
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)
    println(authors.plus("Hemingway"))
    println(authors.contains("Hemingway"))

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (author in authors){
        println(author)
    }
    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }

}