package pattern

fun main() {
    hollowRectangle(numberOfRows = 3, numberOfColumn = 6)
}

/**
 * Hollow Rectangle
 * Example :-
 *   * * * *
 *   *     *
 *   *     *
 *   * * * *
 *
 *   For Hollow rectangle we need to put the same logic as square or rectangle
 *   Only different is that, for first row and last row we need to print all the *
 *   else only first and end *
 */
fun hollowRectangle(numberOfRows: Int, numberOfColumn: Int) {
    // Row
    for (i in 0 until numberOfRows) {
        // Column
        for (j in 0 until numberOfColumn) {
            // For first row and last row or first column or last column we need to print *
            if (i == 0 || i == numberOfRows - 1 || j == 0 || j == numberOfColumn - 1){
                print("* ")
            }else{
                print("  ")
            }
        }
        println()
    }
}