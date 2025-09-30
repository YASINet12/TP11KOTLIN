package TP11

fun main() {
    val estPair: (Int) -> Boolean = { it % 2 == 0 }

    val nombres = listOf(3, 4, 7, 10, 15)

    for (n in nombres) {
        if (estPair(n)) {
            println("$n est pair")
        } else {
            println("$n est impair")
        }
    }
}
