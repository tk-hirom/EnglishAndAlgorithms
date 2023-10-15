// selectionSort
fun findSmallest(list: List<Int>): Int {
    var smallest = list[0]
    var smallestIndex = 0
    for (i in 1 until list.size) {
        if (list[i] < smallest) {
            smallest = list[i]
            smallestIndex = i
        }
    }
    return smallestIndex
}

fun selectionSort(list: MutableList<Int>) {
    val result = emptyList<Int>().toMutableList()
    for (i in 0 until list.size) {
        var smallestIndex =  findSmallest(list)
        result.add(list.removeAt(smallestIndex))
    }
    print(result)
}

fun main () {
    selectionSort(mutableListOf(5, 3, 6, 2, 10))
}
