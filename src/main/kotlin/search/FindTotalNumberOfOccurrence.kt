package search

fun main() {
    findTotalNumberOfOccurrence()
}

fun findTotalNumberOfOccurrence() {
    val sortedArray = arrayOf(10, 20, 40, 40, 40, 40, 40, 50, 60, 70, 80)
    // Check the first occurrence of the index
    val firstOccurrenceOfNumber = findTheFirstOccurrenceOfNumber(array = sortedArray, searchElement = 40)
    // Check the last occurrence of the index
    val lastOccurrenceOfNumber = findTheLastOccurrenceOfNumber(array = sortedArray, searchElement = 40)

    // Get the value
    val result = lastOccurrenceOfNumber - firstOccurrenceOfNumber + 1
    if (result == -1) {
        println("Element not found")
    } else {
        println("Total number of occurrence of the element is : $result")
    }

}

fun findTheFirstOccurrenceOfNumber(array: Array<Int>, searchElement: Int): Int {
    // Find the size of the array
    val n = array.size
    // Initialize the start
    var start = 0
    // Initialize the end
    var end = n - 1
    // Store the position
    var position = -1

    // Start a loop until start <= end
    // Start cannot more than end
    while (start <= end) {
        // Find the mid
        val mid = start + (end - start) / 2
        // Check if mid is equal to search element or not
        if (array[mid] == searchElement) {
            // Update the position
            position = mid
            // As we need to find the first occurrence
            // We need to go Left
            // Update the end
            end = mid - 1
        }
        // If search element is more than mid
        else if (searchElement > array[mid]) {
            // Go Right
            // Update the start
            start = mid + 1
        }
        // If the search element is not more than mid
        else if (searchElement < array[mid]) {
            // Go Left
            // Update the end
            end = mid - 1
        }
    }
    return position
}

fun findTheLastOccurrenceOfNumber(array: Array<Int>, searchElement: Int): Int {
    // Find the size of the array
    val n = array.size
    // Initialize the start
    var start = 0
    // Initialize the end
    var end = n - 1
    // Store the position
    var position = -1

    // Start a While Loop until start <= end
    // Start cannot greater than the end
    while (start <= end) {
        // Find the mid
        val mid = start + (end - start) / 2
        // Check if the Mid is equal to search element or not
        if (array[mid] == searchElement) {
            // Update the position
            position = mid
            // The last occurrence should on the left of the middle
            // Update the Start
            start = mid + 1
        }
        // Check if search element is large than mid element or not
        else if (searchElement > array[mid]) {
            // Go Right
            // Update the start
            start = mid + 1
        }
        // Check if search element is less than the mid element
        else if (searchElement < array[mid]) {
            // Go Left
            // Update the end
            end = mid - 1
        }
    }
    return position
}