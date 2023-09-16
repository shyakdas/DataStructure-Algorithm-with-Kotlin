package search

fun main() {
    val array = arrayOf(1, 2, 3, 4, 6, 7, 8, 9)
    val result = findMissingElementInASortedArray(array = array)
    if (result == -1) {
        println("Element not found")
    } else {
        println("Missing element is :- $result")
    }
}

/**
 * Find the missing element
 * Input :- Linear sorted array
 */
fun findMissingElementInASortedArray(array: Array<Int>): Int {
    // Find the size
    val n = array.size
    // Initialize the start
    var start = 0
    // Initialize the end
    var end = n - 1
    // Store the answer
    var ans = -1

    // Loop until start > end
    while (start <= end) {
        // Find the Mid value
        val mid = start + (end - start) / 2
        // Check difference of mid element and index of the array
        val diff = array[mid] - mid
        if (diff == 1) {
            // Move to Right Side
            start = mid + 1
        } else {
            // Store the answer
            ans = mid
            // Move Left
            end = mid - 1
        }
    }
    // For the last index, if ans is coming as 0
    // We need to return the arraySize + 1 value as a missing elemenet
    if (ans + 1 == 0) {
        return n + 1
    }
    // Return
    return ans + 1
}