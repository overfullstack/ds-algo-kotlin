package leetcode.arrays.subarray

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import leetcode.arrays.subarray.lengthOfLongestSubstringKDistinct

class LongestSubstringWithKDistinctTest : StringSpec({

    "Length Of Longest Substring with K Distinct chars" {
        lengthOfLongestSubstringKDistinct("eceba", 2) shouldBe 3
        lengthOfLongestSubstringKDistinct("xxyxz", 2) shouldBe 4
    }
})

