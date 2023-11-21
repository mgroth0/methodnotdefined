package matt

import matt.sub.box.DoubleBox
import kotlin.test.Test


class SomeTests() {
    @Test
    fun subtract() {
        println(DoubleBox(1.0) - DoubleBox(2.0))
    }
}