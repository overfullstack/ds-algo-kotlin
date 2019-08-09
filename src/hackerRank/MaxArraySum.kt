/* gakshintala created on 8/8/19 */
package hackerRank

import java.util.*

fun maxSubsetSum(arr: Array<Int>): Int {
    var exclPrev = 0
    var inclPrev = arr[0]
    for(i in 1 until arr.size) {
        val exclCur = maxOf(inclPrev, exclPrev) // If I don't include current character, it should be max of either inclusive of previous character or exclusive of previous character 
        // for next-iteration
        inclPrev = arr[i] + exclPrev
        exclPrev = exclCur
    }
    return maxOf(exclPrev, inclPrev)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val res = maxSubsetSum(arr)

    println(res)
}