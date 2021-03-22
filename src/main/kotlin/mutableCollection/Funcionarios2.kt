package mutableCollection
//data class Funcionarios está dando as properidades que todos os funcionários (pedro,joao e maria) podem adquirir.
class Funcionarios2(
        val nome: String,
        val salario: Double,
        val tipoContratacao: String,
    ){
        override fun toString():String =
            """
           Nome: $nome
           Salário: $salario
           Tipo de Contratação: $tipoContratacao
        """
}
