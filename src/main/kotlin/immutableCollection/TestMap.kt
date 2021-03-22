package immutableCollection

fun main(){
    //Pair representa um par de dados, por exemplo, 1 pair de String e Double equivale ao valor do pair;
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    //O mapOf representa um conjunto de "coordenadas" que diz respeito ao map1
    val map1 = mapOf(pair)
    //O map1 representa que cada objeto, k é a string e o valor v é o double, vão receber os valores alocados do pair;
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("-----------------------------------------------------")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}