fun main() {
    print(countElements(listOf(1,2,3,4).toMutableList()))
}

fun countElements(elements: MutableList<Int>): Int {
    return if (elements.size == 0) {
        0
    } else {
        1 + countElements(elements.dropLast(1).toMutableList())
    }
}