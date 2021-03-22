package immutableCollection

fun main () {
    //Indica um uma palavra reservada que usa o tipo Double para representar um Array de números decimais.
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3000.0

    //Para fazer uma interação (obter uma saída), usarei o Lambda .forEach.
    salarios.forEach { println(it) }

    /*Segundo Exemplo:
        . Selecionar um Lambda forEach, a partir da constante salarios para interá-lo;
        . Para dar um aumento em cada salario, necessitamos mudar o valor que estava atribuído;
        . O forEachIndexed serve para modificar e interar o objeto salario;
     */
    /*
    salarios.forEachIndexed { index, salario->
        salarios[index] = salarios * 1.1
        //Amostra: salarios[0] = 1000 * 1,1
    }
    salarios.forEach { println(it) }
     */

    /*Exemplo Bônus:
        . Objetivo: Obter um doubleArray de valores pré estabelecidos
        . Lembrar que IntArray(size:N) e o Array<String>(size:N) sempre precisa indicar o tamanho e depois declarar os valores;
        . Lembrar que o intArrayOf(n-1, n, n+1) e o ArrayOf("name", "name1") precisa indicar os elementos;
        . Neste contexto, o doubleArrayOf() precisa indicar os elementos;
        . Lembrar que o sort() indica colocar os números em ordem crescente e as palavras/letras em ordem alfabética;
        . Lembrar do Lambda forEach {} que indica os valores ou palavras a serem repetidas, sendo cada elemento substituído pela "invocação" it;
     */
    val salarios2= doubleArrayOf(1500.0, 1250.0, 5000.0)
    println("-------------------------------------------------")
    salarios2.sort()
    salarios2.forEach { println(it) }
}



