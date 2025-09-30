package TP11

class NegativeNumberException(message: String): Exception(message)

fun convertToInt(str: String): Int {
    return try {
        val n = str.toInt()
        if (n < 0) {
            throw NegativeNumberException("Nombre négatif non autorisé : $n")
        }
        n
    } catch (e: NumberFormatException) {
        println("Erreur : la chaîne \"$str\" n'est pas un entier valide")
        0
    }
}

fun main() {
    println(convertToInt("42"))
    println(convertToInt("-5"))
    println(convertToInt("abc"))
}
