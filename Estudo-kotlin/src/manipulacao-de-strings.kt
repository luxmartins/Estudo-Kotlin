/*
 Manipulação de Strings

 Strings possuem diversos métodos associados:
 indexação, concatenação, comparação, formatação;
 pode ser concatenada com plus/+;
 também é tradada como array de char

 strings como array;
 First(), last(), string.length, string[index];

 */

/*
Aqui estaŕa anotações sobre concatenação
podemos usar o sinal de "+" ou ${} e também tem o $variável
 */

/*
Aqui estaremos anotando sobre a formatação de uma string o que é parecido em várias linguagens

Capitalização de string:
capitalize() - primeria letra da string maiúscula;
toUpperCase() - DEIXA A STRING TODA MAIÚSCULA;
toLowerCase() - dexa toda a string minúscula;
decapitalize() - o inverso do capitalize, deixará a primeira letra da string minúscula;

Remoção de espaços:
trimEnd()
trimStart()
trim()

Substituição de caracteres:
replace(x,y)

Formatação:
"Padrão ${valor}".format(valor)

 */

/*
Empty x Blank
Empty se a string se estiver vazio
Blank ou se a string estiver em branco
 */
fun main() {
    val s = "Olá, mundo!"
    println(s[0])
    println(s.first())
    println(s[10])
    println(s.last())

    println(s[s.length -1])
    println(s.last())

    val name = "Lucas"
    val sobrenome = "Martins"
    println(name + sobrenome) // usando a concatenação com o +
    println("${name} ${sobrenome}")
    println("${name.length} ${sobrenome.length}")
    println("$name $sobrenome")
    println("${name.capitalize()} ${sobrenome.capitalize()}") // capitalize deixará a primeira string maiúscula

    val vazio = ""
    println(vazio.isEmpty())
    println(vazio.isNullOrBlank() || vazio.isNullOrEmpty())

    val branco = "     "
    println(branco.isEmpty())
    println(branco.isBlank())


}