package search

fun main() {
    val sortedArray = arrayOf(10, 20, 30, 40, 50, 60, 70, 80)
    val result = binarySearch(array = sortedArray, searchElement = 80)
    if (result == -1) {
        println("Element not found")
    } else {
        println("Element found at position of $result")
    }
}

/**
 * Binary search is the algorithm which can be used to find any element in an sorted array
 * This algorithm will work only on sorted array
 * The time complexity of this algorithm is OLogN
 */
fun binarySearch(array: Array<Int>, searchElement: Int): Int {
    // First find the size of array
    val n = array.size
    // Initialize the first element index of an array
    var start = 0
    // Initialize the last element index of an array
    // To find the last element index we need to find the size of array
    var end = n - 1

    while (start <= end) {
        // Find the Mid element
        val mid = start + (end - start) / 2
        // Check if the search element is equal of array[mid] element or not
        if (array[mid] == searchElement) {
            // Return then index
            return mid
        }
        // Check if search element is greater than of array[mid] or not
        else if (searchElement > array[mid]) {
            // Update the start
            // Go to Right
            start = mid + 1
        }
        // Check if search element is lower than or array[mid] or not
        else if (searchElement < array[mid]) {
            // Update the end
            // Go to Left
            end = mid - 1
        }
    }
    return -1
}

