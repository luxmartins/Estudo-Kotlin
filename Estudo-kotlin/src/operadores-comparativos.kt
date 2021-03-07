fun main() {
    val a = 15
    val b = 20
    // a maior do que b
    println(a > b)

    // a maior ou igual a b
    println(a >= b)

    // a igual a b
    println(a == b)

    // a diferente de b
    println(a != b)

    /*
     Pomemos usar também o comando  "compareTo" retornam os valores -1 (menor que), 0 (igual) ou 1 (maior). Já os operadoes retornam valores booleanos
     o comando equals retorna um booleano
     */

    println(a.compareTo(b))
    println(a.equals(b)) // Igual
    println(!a.equals(b))   // Diferente
}