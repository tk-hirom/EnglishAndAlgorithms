fun main() {
    print(getMax(listOf(9,4,1,6,7).toMutableList()))
}

fun getMax(elements: MutableList<Int>): Int {
    return if (elements.size == 0) {
        0
    } else {
        var target = elements.removeAt(0)
        var maximumValueAmongTheRemaining = getMax(elements)
        if(target > maximumValueAmongTheRemaining) {
            target
        } else {
            maximumValueAmongTheRemaining
        }
    }
}