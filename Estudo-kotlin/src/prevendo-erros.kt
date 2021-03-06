fun main() {
    /* O Kotlin precisa iniciar a partir de alguma referência, essa referência será o valor atribuído ou o tipo que queremos que ela receba
     uma variável não pode ser declarada sem tipo e sem atribuição
     */

    /*
    var currentAge
    currentAge = 22 //ERRO!
    var currentYear = "Ano"
    currentYear = 2021 // ERRO!
     */

    // Ao invés de usar a primeira iremos usar essa que tem uma atrivuição
    val currentAge = 90
    // ele vai tratar currentAge como inteiro
    println(currentAge)

    // aqui vamos especificar um valor a ela que no caso ela será do tipo inteiro

    val current:Int
    current = 25
    println(current)

    /* Podemos alterar o tipo dela usando o "to", no caso aqui usando o toString() fica no formato string, ela muda a tipagem de uma variável
    uma variável com inferência de tipo só receberá valores do mesmo tipo que a sua primeira atribuição
     */
    var currentYear = "Que ano"
    currentYear = 2021.toString()
    println(currentYear)
}