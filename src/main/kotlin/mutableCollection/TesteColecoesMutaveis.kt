package mutableCollection
/*
    . Mutable nós conseguimos alterar os valores;
 */
fun main(){

    val joao = Funcionarios2("João", 2000.0, "CLT")
    val pedro = Funcionarios2("Pedro", 1500.0, "PJ")
    val maria = Funcionarios2("Maria", 4000.0, "CLT")

    println("------------------------------------LIST----------------------------------------")
    //Criando uma lista onde, somente o joao e a maria trbalham, os valores podem ser alterados. Ou seja, adicionado ou retirado;
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    /*  Primeiro Exemplo:
        . Para adicionar um funcionário a esta lista, é necessário seguir o será apresentado;
        . Atente-se ao ".add";
    */
    println("------------------------------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    /*  Segundo Exemplo:
        . Supondo que demitimos o joão;
        . Atente-se ao ".remove";
     */
    println("----------------------------------SET-----------------------------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    /*  Teceiro Exemplo:
        . Atente-se ao mutable->SET<-Of!!!

     */
    println("-------------------------------------------------")
    val funcionariosSet = mutableSetOf(joao)
  //funcionarios.forEach{println(it)} Usamos comentário nesta partepara não trazer conflitos com a próxima.

    println("-------------------------------------------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    //Depois de ter adicionado maria e pedro a mutableSetOf(joao) nós vamos "demitir" maria.
    println("-------------------------------------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}
}