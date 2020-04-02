import java.math.BigDecimal

data class Seat(val row: Int, val num: Int, val price: BigDecimal, val description: String) {

    override fun toString(): String = "Seat $row-$num $$price ($description)"
}