package pattern

fun main() {
    perfectSquare(numberOfRows = 4)
}

/**
 * Find the perfect Square Pattern
 * @param numberOfRows
 *
 * To solve this type of problem you need think from row side
 */
fun perfectSquare(numberOfRows: Int) {
    // Start the for loop for the rows
    for (i in 0 until numberOfRows) {
        // Then print all the *
        for (j in 0 until numberOfRows) {
            print("* ")
        }
        println()
    }
}