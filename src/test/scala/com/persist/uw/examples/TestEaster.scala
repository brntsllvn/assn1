package com.persist.uw.examples

import org.specs2._

class TestEaster extends mutable.Specification {
  "2016" >> (Easter.easter(2016) mustEqual Day(3, 27))
  "1761" >> (Easter.easter(1761) mustEqual Day(3, 22))
  "2038" >> (Easter.easter(2038) mustEqual Day(4, 25))
  "2020" >> (Easter.easter(2020) mustEqual Day(4, 12))
  "1986" >> (Easter.easter(1986) mustEqual Day(3, 30))
  "2112" >> (Easter.easter(2112) mustEqual Day(4, 17))
}
