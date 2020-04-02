import java.math.BigDecimal

// SEAT PRICES:
// Seats in row 14 and 15 cost 14.50  -- cheaper seat and Backrow
// Seats in row 1 to 13 and numbered 1-3 or 34 -36 cost 16.50 -- Obstructed view
// all other seats in row 1 cost 21.00 -- Best view
// all other seats cost 18.00  -- Standard seat

class Theater {
    val seats: MutableList<Seat>

    init {
        val mutableSeats = ArrayList<Seat>()
        for(row in 1..15) {
            for(num in 1..36) {
                if (row == 15) mutableSeats.add(element = Seat(row, num, BigDecimal(14.50), "Backrow"))
                if (row == 14) mutableSeats.add(element = Seat(row, num, BigDecimal(14.50), "Cheaper Seat"))
                if (row == 1 && num >3 && num < 34) {
                    mutableSeats.add(element = Seat(row, num, BigDecimal(21.00), "Best view"))
                    continue
                }
                if(row < 14) {
                    when(num) {
                        1,2,3,34,35,36 -> mutableSeats.add(element = Seat(row, num, BigDecimal(16.50), "Obstructed view"))
                        else -> mutableSeats.add(element = Seat(row, num, BigDecimal(18.00), "Standard Seat"))
                    }
                }
            }
        }

        val test = mutableListOf<Seat>()

        seats = test.toList()
    }






}