fun divide(dividende: Int, diviseur: Int): Int? {
    return try {
        dividende / diviseur
    } catch (e: ArithmeticException) {
        println("Erreur : Division par zéro interdite")
        null
    }
}

fun main() {
    println("Résultat : ${divide(10, 2)}")
    println("Résultat : ${divide(10, 0)}")
}
