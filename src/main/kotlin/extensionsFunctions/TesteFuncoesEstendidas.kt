package extensionsFunctions

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    println("________________________________________")
    println(salarios.somatoria())

    println("________________________________________")
    println(salarios.media())
}