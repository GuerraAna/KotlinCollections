package immutableCollection

fun main(){
    /*Primeiro exemplo Exemplo:
        . Ao criar um Array() é necessário indicar o tamanho dele e o tipo;
        . O Array sempre começa a contagem do índice zero [0] para frente;
        . O for é usado para a interação do Array. Com o objetivo de ver os valores contidos no Array;
        . A estrutura do for é sempre for (i in lista);
     */
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    //Este aqui é o mais fácil de utilizar, mas também é o mais básico.
    for (value in values){
        //Sempre printa o valor que fora desejado (value).
        println(value)
    }
    /*Segundo exemplo:
        . Uso do recurso de lambda do Kotlin, ao utilizar o .forEach;
        . O it faz o papel da variável valor;
     */
    println("-------------------------------------------------")
    values.forEach{
        println(it)
    }

    //Pode-se usar a variável valor, com ->, como substituta do it;
    //Este aqui é fácil e utilizar, mas não tão básico. Salve esses dois exemplos que citei como "faceis" e usa sempre que quiser.
    println("-------------------------------------------------")
    values.forEach{ value->
        println(value)
    }

    /* Terceiro Exemplo
       . Interar sobre os índices do próprio Array.
       . Com o objetivo de criar um Array a prtir dos índices.
     */
    println("-------------------------------------------------")
    for (index in values.indices){
        println(values[index])
    }

    // O recurso Sort ()sempre ordenará do menor para o maior.
    // O index representa índice.
    println("-------------------------------------------------")
    values.sort()
    for (index in values.indices){
        println(values[index])
    }
}