package search

fun main() {
    val sortedArray = arrayOf(10, 20, 40, 40, 40, 40, 40, 50, 60, 70, 80)
    val result = findTheFirstOccurrenceOfANumber(array = sortedArray, searchElement = 40)
    if (result == -1) {
        println("Element not found")
    } else {
        println("First occurrence of the element found at position of $result")
    }
}

/**
 * Q. Find the first occurrence of a number in a sorted array
 * Let's take an example
 * Input array :- [10,20,20,30,40,50,60]
 * Output :- 1
 *
 * Explanation:- As 20 is present twice in a sorted array
 * We need to find the first occurrence of 20,
 * As we can see 20 is present first at the index of 1,
 * So the output we are expecting is 1
 */
fun findTheFirstOccurrenceOfANumber(array: Array<Int>, searchElement: Int): Int {
    // Find the size of the array
    val n = array.size
    // Initialize the first index
    var start = 0
    // Initialize the last index, arraySize -1
    var end = n - 1
    // Take a variable to store the occurrence position
    var position = -1

    while (start <= end) {
        // Find the mid position of the array
        val mid = start + (end - start) / 2
        // Check if the array[mid] element is the equal to search element or not
        if (array[mid] == searchElement) {
            position = mid
            end = mid - 1
        }
        // Check if search element is greater than of array[mid] or not
        else if (searchElement > array[mid]) {
            start = mid + 1
        }
        // Check if search element is lower than or array[mid] or not
        else if (searchElement < array[mid]) {
            end = mid - 1
        }
    }
    return position
}