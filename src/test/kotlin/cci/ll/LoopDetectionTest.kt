package cci.ll

import ds.SLLNode
import ds.getNodeForValue
import ds.last
import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mu.KLogging

class LoopDetectionTest : StringSpec({
/*     "Loop Detection" {
        forAll(
            row(intArrayOf(1, 2, 3, 4, 5), 3)
        ) { arr, result ->
            val node = SLLNode.of(arr)
            val loopNode = node?.getNodeForValue(result)
            logger.info { node }
            val lastNode = node?.last()
            logger.info { node }
            //lastNode?.next = loopNode // This doesn't work.

            node?.detectLoop()?.value shouldBe result
        }
    } */
}) {
    companion object : KLogging()
}
