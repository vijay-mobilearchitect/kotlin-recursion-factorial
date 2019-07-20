# kotlin-recursion-factorial

Write a factorial function in Kotlin that takes a positive integer,  as a parameter and prints the result of N! ( N factorial).

import java.util.*

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

Input :

n = 4

Output :
result = 24

Explanation:

Recursive functions and algorithms
A common computer programming tactic is to divide a problem into sub-problems of the same type as the original, solve those sub-problems, and combine the results. This is often referred to as the divide-and-conquer method; when combined with a lookup table that stores the results of solving sub-problems (to avoid solving them repeatedly and incurring extra computation time), it can be referred to as dynamic programming or memoization. (Ref Explanation : https://en.wikipedia.org/wiki/Recursion_(computer_science))
