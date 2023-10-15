// selectionSort
// Define a function named findSmallest that takes a list as an argument and returns the smallest element in the list.
fun findSmallest(list: List<Int>): Int {
    var smallest = list[0]
    var smallestIndex = 0
    for (i in 1 until list.size) {
        // If the current element is smaller than 'smallest', assign the current value to 'smallest'
        if (list[i] < smallest) {
            smallest = list[i]
            smallestIndex = i
        }
    }
    return smallestIndex
}

// Define a function names selectionSort that takes a list as an argument and prints the sorted list.
fun selectionSort(list: MutableList<Int>) {
    // Assign an empty list to a variable named 'result'
    val result = emptyList<Int>().toMutableList()
    for (i in 0 until list.size) {
        var smallestIndex =  findSmallest(list)
        // Remove the smallest element from the list and add it to the 'result' list
        result.add(list.removeAt(smallestIndex))
    }
    print(result)
}

fun main () {
    // Call the 'selectionSort' function with argument [5, 3, 6, 2, 10], and print the returned result
    selectionSort(mutableListOf(5, 3, 6, 2, 10)) // Output: [2, 3, 5, 6, 10]
}
