import java.math.BigDecimal

// SEAT PRICES:
// Seats in row 14 and 15 cost 14.50  -- cheaper seat and Backrow
// Seats in row 1 to 13 and numbered 1-3 or 34 -36 cost 16.50 -- Obstructed view
// all other seats in row 1 cost 21.00 -- Best view
// all other seats cost 18.00  -- Standard seat

class Theater {
    private val hiddenSeats = ArrayList<Seat>()

    init {
        fun getPrice(row: Int, num: Int): BigDecimal {
            return when {
                row >= 14 -> BigDecimal(14.50)
                num <=3 || num >=34 -> BigDecimal(16.50)
                row == 1 -> BigDecimal(21)
                else -> BigDecimal(18)
            }
        }

        fun getDescription(row: Int, num: Int): String {
            return when {
                row == 15 -> "Back Row"
                row == 14 -> "Cheaper Seat"
                num <=3 || num >=34 -> "Restricted View"
                row == 1 -> "Best View"
                else -> "Standard Seat"
            }
        }

        for (row in 1..15) {
            for (num in 1..36) {
                hiddenSeats.add(Seat(row, num, getPrice(row,num), getDescription(row, num)))
            }
        }
    }

    val seats
    get() = hiddenSeats.toList()






}