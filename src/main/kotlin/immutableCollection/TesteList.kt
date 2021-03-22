package immutableCollection

fun main(){
    /*Primeiro Exemplo:
        . Usaremos a data class funcionario para melhor exemplificar o que desejamos;
        . Lembrar de como invocar uma data class dentro de um objeto;
        . Objetivo: Como iniciar uma lista de funcionários? Usaremos Listas!
    */
    val joao = Funcionario("João", 1000.0)
    val pedro = Funcionario("Pedro", 2000.0)
    val maria = Funcionario("Maria", 4000.0)
    //A lista integrará todos os funcionários. Como é objeto, não precisa colocar entre aspas;
    val funcionarios = listOf(joao, pedro, maria)

    //PRIMEIRO Exemplo: Objetivo: Interar a lista. Lembrar que o it representa o objeto funcionário.
    funcionarios.forEach { println(it) }

    //SEGUNDO Exemplo: "Investigar" se há uma Maria dentro do conjunto funcionários.
    println("-------------------------------------------------")
    println(funcionarios.find { it.nome == "Maria" })
    }


