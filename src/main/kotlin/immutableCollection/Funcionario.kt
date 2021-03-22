package immutableCollection
/*
    . Chegamos em uma parte muito interessante a respeito de POO, de uma olhada no repositório Theorical.Basis.kotlin para conhecer um pouco mais sobre a teoria.
    . A data class Funcionario é um padrão para todos os funcionarios de um determinado local, ou seja, todos eles vão ter suas propriedades atribuídas da data class;
    . A data class Funcionario possui dois parâmetros 1) nome: String;
                                                      2) salario: Double.
    . A data class indicará um retorno um pouco mais organizado, ele está contido no bloco de códigos dela;
 */

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    //O objetivo desta função é impor uma "ação" de organização de um possível prin na fun main desta data class.
    override fun toString(): String =
        """ 
           Nome:    $nome
           Salário: $salario
        """.trimIndent()
}
