package mutableCollection

fun main() {
    val joao = Funcionarios2("João", 2000.0, "CLT")
    val pedro = Funcionarios2("Pedro", 1500.0, "PJ")
    val maria = Funcionarios2("Maria", 4000.0, "CLT")

    /* Primeiro Exemplo:
      . Lembrar da fun criada na class Repositorio:  fun creat(id:String, value: T){
                                                            map.put(id, value)
                                                     }
      . A seguir, o exemplo mostrará que o objeto repositorio ira pegar a "propriedade" estabelecida na fun do repositorio;
      . Cada objeto criará um novo id dentro dos dados do repositorio.
      . O findById será usado para encontrar o id de maria, se existir, parecerá o id dela e os dados, caso contrário estará null.
     */
    val repositorio = Repositorio<Funcionarios2>()
    repositorio.creat(joao.nome, joao)
    repositorio.creat(pedro.nome, pedro)
    repositorio.creat(maria.nome, maria)

    //Neste trecho, fora utilizado a função findById lá da class repositorio.
    println(repositorio.findById(maria.nome))

    /*Segundo Exemplo:
        . Neste caso, será impresso todos os funcionários;
        . Perceba que chamou primeiro a objeto repositorio da fun main e a partir dele invocou o que ele deseja. No caso, a função da class Repositório;
     */
    println("------------------------------------")
    repositorio.findAll().forEach { print(it) }

    println("------------------------------------")
    println(repositorio.remove(maria.nome))
    println("------------------------------------")
    repositorio.findAll().forEach { println(it) }
}