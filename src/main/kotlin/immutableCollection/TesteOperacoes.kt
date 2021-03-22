package immutableCollection
/*
    . Para começarmos a exemplificar iremos necessitar da função principal (fun main);
    . Posterior a isso, precisamos declarar o tipode der Array que desejamos;
    . Lembrar: 1) DoubleArrayOf(elements), IntArrayOf(elements), arrayOf("String");
               2) IntArray(size);
               3) Array<String>(size);
 */
fun main(){
    println("-------------------------------------------------")
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    /* Primeiro Exemplo:
        . Objetivo: Saber qual é o maior valor e depois qual é o menor valor;
        . Observe que max() , min() e avarage() represntam, respectivamente, os valores maximos, mínimos e a média;
        . O max() está depreciado (riscado) que indica que é recomendado não ser utilizado;
        . O min() está depreciado (riscado) que é recomendado não utilizar esta ação;
        . Para tirar a depreciação destas palavras use OrNul logo após à elas;
    */
    println("-------------------------------------------------")
    //println("Maior salario: ${salarios.max()}")
    println("Maior salario: ${salarios.maxOrNull()}")
    //println("Menor salario: ${salarios.min()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    /* Segundo Exemplo:
        . Objetivo: Filtrar os salários de acordo o que deseja;
        . Observe que o filter {} indica o filtro dentre os valores no Array salarios;
        . Dentro das chaves é necessário indicar a condição desejada, lembre-se que it significa um elemento dentro do conjunto filter {};
        . Isto {it > 2500.0} representa: para os elementos no conjunto salarios checaremos se ele é maior que 2500.0;
     */
    println("-------------------------------------------------")
    val salariosMaiorQue2500 = salarios.filter {it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }


    /* Teceiro Exemplo:
        . Objetivo: Quantos elementos dentro do array estão dentro de um range?
        . Para contar quantos elementos, utiliza-se a palavra .count{}
        . Primeiro: Chamaremos o conjunto desejado;
        . Contaremos cada elemento dentro deste conjunto;
        . Iremos impor uma condição de que contaremos cada elemento (representado por it) entre o range 2000.0..5000.0 e irá inprimir os valores existentes que respeitem a condição.
        . Lembre-se que é utilizado o null por que a condição imposta é uma investigação de número por número. Diferente do true or false, quando ocorrer uma comparação entre o elemento de um conjunto que eu desejo achar e o elemento da condição.
     */
    println("-------------------------------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    /* Quarto Exemplo:
        . Objetivo: buscar um valor específico dentro do conjunto;
        . Para buscar utiliza-se a palavra .find{}
        . Primeiro: Chamaremos o conjunto que desejamos investigar;
        . Segundo: Usaremos a palavra que desejamos efetuar uma ação;
        . Terceiro: colocar uma condição desejada.
     */
    println("-------------------------------------------------")
    println(salarios.find{ it == 2500.0})
    //Imprime o valor, caso seja encontrado. Caso contrário, imprimirá o null (ou seja, não existe).

    /* Quinto Exemplo:
        . Objetivo: Encontrar qualquer elemento que respeite a condição imposta;
        . Para buscar esse elemento qualquer, utilizamos a palavra .any();
        . Primeiro: Invocaremos o conjunto desejado para investigar;
        . Segundo: Colocaremos a palavra que desejamos para respeitar a consição e fornecer o que é pedido;
        . Terceiro: Será imposto uma condição.
        . Lembre-se que o true é porque existem um número no conjunto salarios que respeite a condição. Caso contrário terá false;
    */
    println(salarios.any{ it == 1000.0})
}
