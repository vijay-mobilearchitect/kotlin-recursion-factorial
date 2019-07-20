import java.util.*

// Complete the factorial function below.

fun factorial(n: Int): Int {

    return if (n > 1) {
        n * factorial(n-1)
    } else {
        n
    }
}

fun main() {
    val scanValue = Scanner(System.`in`)
    val n = scanValue.nextInt()
    val result = factorial(n)
    println(result)
}