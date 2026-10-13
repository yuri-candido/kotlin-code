package org.example.some.concepts

fun main() {
    var artistOne = Artist(1, "Yuri", "www.google.com")
    println(artistOne) // a variável já usa toString

    // var notNullArtist: Artist = null  # sem o operador ?, a variável não aceita ser nula

    var artist: Artist? = null // o kotlin possui segurança em tempo de compilação
    println(artist)

    fun Artist.hello(mensagem: String) { // extension function sendo criada na função main
        println("Olá, $name, $mensagem")
    }

    artistOne.hello("parabéns!")

    var artistTwo = Artist(0,"Name", "www.google.com") // lança um IllegalArgumentException

    // função lambda

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumber = numbers.filter {it % 2 == 0}
    println(evenNumber)
}

data class Artist(val id: Int, val name: String, val url: String) {
    init {
        require(name.isNotBlank() && id > 0) {
            "Name must not be blank and the id must be positive"
        }
    }
} // data class fornece métodos prontos