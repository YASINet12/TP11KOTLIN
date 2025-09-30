fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val somme = calculate(10, 5) { x, y -> x + y }
    println("Addition : $somme")

    val diff = calculate(10, 5) { x, y -> x - y }
    println("Soustraction : $diff")

    val produit = calculate(10, 5) { x, y -> x * y }
    println("Multiplication : $produit")
}
