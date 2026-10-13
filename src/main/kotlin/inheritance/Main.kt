package org.example.br.com.inheritance

fun main() {
    var person = Person("John", "Doe", "Eal", "instanciado")
    println(person.daysOnVacation())

    println("-----------------")

    println("você ganhou dias de férias: " + person.daysOnVacation(5))
}

open class Animal(val name: String)

class Person(name: String, val firstName: String, private val lastName: String, message: String) : Animal(name) {
    init {
        require(name.isNotBlank())
        println(message) // a mensagem só existe dentro do bloco init
    }

    fun daysOnVacation(days: Int = 1): Int { // parâmetro com valor definido, mas que pode ser mudado ao chamar a função
        return days
    }
}

