// calculate factorial of a number by using recursion
fun main () {
    print(factorial(5)) // Output: 150
}

// Define a function named 'factorial' that takes one parameter: 'number'
fun factorial (number: Int): Int {
    // If number is equal to 0 or 1,
    if (number in (0,1)) {
        // return the
        return number
    } else {
        // Call recursively the 'factorial' function with 'number - 1' and multiply the result by 'number'
        return number * factorial(number - 1)
    }
}
