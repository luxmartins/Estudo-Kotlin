// Nullability

/*
 Qualquer tipo pode ser nulo, porém isso deve ser explicado na declaração de variável atráves do uso da
 interrogrção (?)

 a inferência de tipo não atribui nullability
 */

fun main() {
    var month:Int? = null
    // atribui valor null corretamente a month

    /*
    var day:Int = null
    Erro de compilação
     */


    println(month)
}