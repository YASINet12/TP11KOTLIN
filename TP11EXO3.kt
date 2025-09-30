package TP11

fun main() {
    val liste = listOf(10, 20, 30, 40, 50, 60)

    val somme = liste.reduce { acc, n -> acc + n }
    println("Somme de la liste : $somme")
}
