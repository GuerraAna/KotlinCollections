package mutableCollection
/*
    . T é um genérics que mostrará qual é o tipo de dado que estamos trabalhando;
    . Observe o Map dentro da palavra mutableMapOf: Ele é muito usado para chaves de acesso em um banco de dados, no caso o bando de dados se chama repositorio.
*/
class Repositorio <T> {
    //A chave é o Id.
    private val map = mutableMapOf<String, T> ()
    //O retorno desta função trará objetos com as características desejadas nas propriedades;
    fun creat(id:String, value: T){
        map.put(id, value)
    }
    //O retorno desta função excluirá objetos;
    fun remove(id: String) = map.remove(id)

    //O retorno desta função será o valor do map[id].
    fun findById(id:String) = map[id]

    //O retorno desta função trará todos os funcionários;
    fun findAll() = map.values
}
