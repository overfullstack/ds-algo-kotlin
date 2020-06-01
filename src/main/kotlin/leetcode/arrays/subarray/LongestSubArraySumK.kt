package leetcode.arrays.subarray

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * We may have negative numbers.
 */
fun longestSubArraySumK(nums: IntArray, k: Int): Int {
    var max = 0
    var count = 0
    val map = mutableMapOf(0 to -1) // It is `-1` and NOT `0`, coz index 0 is also counted for sum
    for (i in nums.indices) {
        count += nums[i]
        map.putIfAbsent(count, i) // `putIfAbsent`, coz we are looking for longest array, so the earliest the best.
        if (map.containsKey(count - k)) {
            max = maxOf(max, i - map[count - k]!!)
        }
    }
    return max
}
