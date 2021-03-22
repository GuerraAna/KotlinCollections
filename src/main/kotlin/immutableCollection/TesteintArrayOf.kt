package immutableCollection

fun main() {
    /*Primeiro Exemplo:
        . Objetivo, fazer uma opção de não determinar um tanaho;
        . Não determinando o tamanho dá para inserir e retirar valores;
        . IntArrayOf é mais fexível que o IntArray;
        . A forma de Interar entre o intArrayOf é igual ao IntArray;
     */

    val values = intArrayOf (2, 3, 4, 1, 10, 7)

    values.forEach{
        println(it)
    }
    //Lembrar que o sort defini uma ordem crescente dos valores do Array
    println("-------------------------------------------------")
    values.sort()
    values.forEach{
        println(it)
    }
}
