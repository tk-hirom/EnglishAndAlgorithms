// get the total of numbers by recursion
fun main () {
    println(sum(listOf(1,2,3).toMutableList()))
}

fun sum(numbers: MutableList<Int>): Int {
    return if (numbers.size == 0) {
        0
    } else {
        numbers.removeAt(0) + sum(numbers)
    }
}
