import kotlin.test.Test
import kotlin.test.assertEquals

internal class Strings2Test {

    private val strings2: Strings2  = Strings2()

    @Test
    fun testDoubleChar() {
        val expected = "HHeelllloo"; 
        assertEquals(expected, strings2.doubleChar("Hello"))
    }
}
