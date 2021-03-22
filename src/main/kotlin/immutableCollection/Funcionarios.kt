package immutableCollection
// Neste exemplo, parecido ao TesteList, eu usei o data class Funcionarios, com o s no final. Diferente do data class Funcionario do TesteList.

data class Funcionarios(
    val name: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome:    $name
            Salario: $salario
        """
}
