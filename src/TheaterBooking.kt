import java.math.BigDecimal

// SEAT PRICES:
// Seats in row 14 and 15 cost 14.50  -- cheaper seat and backrow
// Seats in row 1 to 13 and numbered 1-3 or 34 -36 cosst 16.50 -- Obstructed view
// all other seats in row 1 cost 21.00 -- Best view
// all other seats cost 18.00  -- Standard seat




fun main(args: Array<String>) {
    val cheapSeats = Theater().seats.filter { it.price == BigDecimal(14.50)}
    for(seat in cheapSeats) println(seat)
}