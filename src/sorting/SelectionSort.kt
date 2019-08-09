package sorting

import java.util.*

fun IntArray.selectionSort() {
    for (i in 0 until size-1) {
        val minIndex = slice(i until size).withIndex().minBy { it.value }?.index ?: 0
        if(minIndex != 0) {
            this[i] = this[minIndex + i].also { this[minIndex + i] = this[i] }
        }
    }
}

fun main() {
    val nums = intArrayOf(2, 12, 89, 23, 76, 43, 12)
    nums.selectionSort()
    print(Arrays.toString(nums))
}   