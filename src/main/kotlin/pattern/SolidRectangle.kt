package pattern

fun main() {
    solidRectangle(numberOfRows = 3, numberOfColumn = 8)
}

/**
 * This function will print the solid rectangle
 * @param numberOfRows
 * @param numberOfColumn
 *
 * For pattern we need to observe the rows
 */
fun solidRectangle(numberOfRows: Int, numberOfColumn: Int) {
    for (i in 0 until numberOfRows) {
        for (j in 0 until numberOfColumn) {
            print("* ")
        }
        println()
    }
}