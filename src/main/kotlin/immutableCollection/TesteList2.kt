package immutableCollection
// Este Tipo de lista não é viável obter uma adição de elementos;

fun main(){
    val ana = Funcionarios ("Ana", 2000.0)
    val clara = Funcionarios ("Clara", 1500.0)
    val guerra = Funcionarios ("Guerra", 3000.0)

    val funcionario = listOf(ana, clara, guerra)

    //Primeiro Exemplo: Imprimir a lista caracterizada na data class
    funcionario.forEach { println(it) }

    //Segundo Exemplo: Encontrar o nome ana dentre os funcionarios.
    println("-----------------------------------------------------")
    println(funcionario.find { it.name == "ana" })

    /*Terceiro Exemplo: Usar o sortedBy() que indica uma ordem que voce deseja. No caso, sortedBy{it.salario} -> Reporesenta os elementos dentro da data class sendo organizados pelo salario;
        . Operações sobre uma collection;
     */
    println("-----------------------------------------------------")
    funcionario
        .sortedBy { it.salario }
        .forEach{ println(it) }

    /*Quarto Exemplo: Usar o groupBy() que indica um grupo por uma determinada característica.
         . Operações sobre uma collection;
         . Neste exemplo o grupo de comparação usado é o salario.
    */
    println("-----------------------------------------------------")
    funcionario
        .groupBy { it.salario }
        .forEach{ println(it) }

}