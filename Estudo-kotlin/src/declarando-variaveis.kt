/*
var(valor mutável, camelCase = Esse é o padrão de nomenclatura da variável 'var'):
ela pode ser alterada durando o código;

val(valor imútavel, camelCase = mesma coisa do 'var'):
Variável que terá seu valor atribuído uma vez, ela não será alterável;

const val (valor imutável, SNAKE_CASE ):
constante cujo valor constante e não será mudado;

 */
// o const val é declarada antes da função main

const val MAX_AGE = 70


fun main() {
    // aqui vou atribuir um tipo para essa variável
    var age:Int = 35

    //pode ser escrito assim
    var currentAge = 25

    // aqui mudei a variável
    currentAge = 30
    //caso eu altere a variável ela mudará pela segunda alteração

    println(currentAge)
    println(age)
    println(MAX_AGE)
}