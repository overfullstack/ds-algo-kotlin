package cci.trees

import ds.tree.TreeNode
import kotlin.math.abs

fun TreeNode?.checkBalanced(): Pair<Int, Boolean> =
    if (this == null) {
        Pair(0, true)
    } else {
        val (leftHeight, leftResult) = left.checkBalanced()
        val (rightHeight, rightResult) = right.checkBalanced()
        val result = leftResult && rightResult && abs(leftHeight - rightHeight) <= 1
        if (result) Pair(maxOf(leftHeight, rightHeight) + 1, result) else Pair(Int.MIN_VALUE, false)
    }
