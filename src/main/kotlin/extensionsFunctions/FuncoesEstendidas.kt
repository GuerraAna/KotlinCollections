package extensionsFunctions
import java.math.BigDecimal

//Extension Function somatoria do tipo Array e característica BigDecimal
fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor
}
//Extension Function media do tipo Array e característica BigDecimal
fun Array<BigDecimal>.media() =
    //Se o array for vazio, o BidDecimal resulta zero.
    if(this.isEmpty()) BigDecimal.ZERO
    //Se o array for diferente de vazio, o BigDecimal resulta em seu tamanho;
    else this.somatoria() / this.size.toBigDecimal()