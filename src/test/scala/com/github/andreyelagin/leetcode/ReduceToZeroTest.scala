package com.github.andreyelagin.leetcode

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class ReduceToZeroTest extends AnyFreeSpec with Matchers {

  "should work" in {
    import ReduceToZero._
    numberOfSteps(14) shouldBe 6
  }
}
