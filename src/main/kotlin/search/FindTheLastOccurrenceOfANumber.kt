package search

fun main() {
    val sortedArray = arrayOf(10, 20, 40, 40, 40, 40, 40, 50, 60, 70, 80)
    val result = findTheLastOccurrenceOfANumber(array = sortedArray, searchElement = 40)
    if (result == -1) {
        println("Element not found")
    } else {
        println("Last occurrence of the element found at position of $result")
    }
}
fun findTheLastOccurrenceOfANumber(array: Array<Int>, searchElement: Int): Int {
    // Initialize the size of the array
    val n = array.size
    // Initialize the start
    var start = 0
    // Initialize the end
    var end = n - 1
    // Save the position
    var position = -1

    // Run a While loop until start <= end
    // As start cannot be more than end
    while (start <= end) {
        // Find the Mid
        val mid = start + (end - start) / 2
        // Check if mid element match the search element or not
        if (array[mid] == searchElement) {
            // Update the index
            position = mid
            // As we need to check the last occurrence we need to check right
            // For that we need to update the start
            start = mid + 1
        } else if (searchElement > array[mid]) {
            // If search element is large of mid element
            // Check Right
            // Update Start
            start = mid + 1
        } else if (searchElement < array[mid]) {
            // If search element is less than of mid element
            // Check Left
            // Update End
            end = mid - 1
        }
    }
    return position
}