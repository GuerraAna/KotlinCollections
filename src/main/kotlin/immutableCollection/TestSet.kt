package immutableCollection

// Note que eu não usei o exemplo do professor em colocar o tipoContratação, eu optei por deixar apenas dois parâmetros;
fun main(){
    val joao = Funcionario("João",2000.0)
    val pedro = Funcionario("Pedro",1500.0)
    val maria = Funcionario("Maria",4000.0)

    /*  Primeiro Exemplo:
        . Objetivo: Fazer uma união entre os conjuntos funcionarios1 e o funcionarios2;
     */
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    println("------------------------------------------------")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)}



    /*  Segundo Exemplo:
        . Objetivo: Fazer uma subtração do conjunto 2 no funcionarios3;
     */
    val funcionarios3 = setOf(joao, pedro, maria)

    println("------------------------------------------------")
    val resultSub = funcionarios3.subtract(funcionarios2)
    resultSub.forEach{ println(it) }


    /*  Terceiro Exemplo:
       . Objetivo: Fazer uma intersecção entre os conjuntos funcionarios3 e o funcionarios2;
    */
    println("------------------------------------------------")
    val resultIntersec = funcionarios3.intersect(funcionarios2)
    resultIntersec.forEach{ println(it) }

}