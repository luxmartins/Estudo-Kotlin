/*
    A função e expressão contém (In), não contém (!In), range/faixa de valores (Int..Int)
 */
const val IDADE_MINIMA = 16
const val IDADE_MAXIMA = 68

fun main() {
    val numbers = listOf(3,9,0,1,2)
    println(12 in numbers)
    println(12 in 0..20)

    // exemplo usando números aleatórios

    val numero = listOf(8,6,34,2,13)
    var numeros = (1..34).random()
    println(numeros)
    println(numeros in numero)

    var age = (10..100).random()
    println(age)
    println(age in IDADE_MINIMA..IDADE_MAXIMA)
    println(age >= IDADE_MINIMA && age <= IDADE_MAXIMA) // aqui também usamos operadores lógicos como o "E"

}