package immutableCollection

/*
    Lembrar do intArrayOf -> Este indica um Array mutável e do IntArray() -> Indica o tamanho do Array.
 */

fun main(){
    /* Primeiro Exemplo:
        . Objetivo: Fazer umArray de Strings;
        . Para fazer um Array de Strings é necessário colocar uma tipagem String;
        . Observe que um Array com o tamanho declarado usa-se o Int antes do Array, já um Array de String se declara na tipagem;
     */

    val nomes = Array<String>(3) {" "}
    nomes[0] ="Maria"
    nomes[1] ="João"
    nomes[2] ="José"
    //Observe que para ter uma saída (interação) do Array, fora necessário criar um for(i in x){ }
    for (nome in nomes){
        println(nome)
    }

    /* Segundo Exemplo:
        . Sort() Representa uma Ordem crescente dos elementos;
        . forEach representa os elementos do Array nomes e o it representa o nome.
     */
    println("-------------------------------------------------")
    nomes.sort()
    nomes.forEach{ println(it)}

    /* Terceiro Exemplo:
        . Lembre-se o arrayOf precisa indicar os elementos;
        . Neste Exemplo os elementos são Strings;
        . Sort() tem uma saída em ordem alfabética;
        . Indica um arrayOf que necessita mostrar os elementos e não precisa tipar, diferente do intArrayOf
     */
    println("-------------------------------------------------")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}
