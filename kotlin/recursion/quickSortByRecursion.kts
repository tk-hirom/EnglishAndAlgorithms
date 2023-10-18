// quickSort
fun main() {
    // Call 'quickSort' function with an argument list of 9,244,5,546,13, and print the returned rersult
    print(quickSort(listOf(9,244,5,546,13)))
}

// Define a function named 'quickSort' that takes one argument: list
fun quickSort(list: List<Int>): List<Int> {
    // If the size of list is less than 2
    return if(list.size < 2) {
        // If the condition is true, return list as is
        list
    } else {
        // If the condition is false, return quick sorted list
        // assign the first element to the variable 'pibot'
        val pibot = list[0]

        var less = mutableListOf()
        // Start a for loop, iterate 'i' over the range fron 0 to the size of list
        for (i in 0 until list.size) {
            // If the element is greater than pibot, use 'add' to add the element of list to 'greater'
            if (pibot > list[i]) {
                less.add(list[i])
            }
        }

        var greater = mutableListOf()
        for (i in 0 until list.size) {
            if (pibot < list[i]) {
                greater.add(list[i])
            }
        }

        return quickSort(less) + pibot + quickSort(greater)
    }
}