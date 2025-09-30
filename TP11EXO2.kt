import kotlin.random.Random

fun main() {
    val nombres = List(10) { Random.nextInt(0, 20) }
    println("Liste : $nombres")

    val pairs = nombres.filter { it % 2 == 0 }
    println("Pairs : $pairs")

    val impairs = nombres.filter { it % 2 != 0 }
    println("Impairs : $impairs")

    val sup10 = nombres.filter { it > 10 }
    println("Supérieurs à 10 : $sup10")
}
