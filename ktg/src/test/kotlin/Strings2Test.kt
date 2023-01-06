import kotlin.test.Test
import kotlin.test.assertEquals

internal class Strings2Test {

    private val strings2: Strings2  = Strings2()

    @Test
    fun testDoubleChar() {
        val expected = "HHeelllloo"; 
        assertEquals(expected, strings2.doubleChar("Hello"))
    }
    @Test
    fun testBobThere() {
        assertEquals(true, strings2.bobThere("ksjdfkldasjboblksjafdkjsdf"))
        assertEquals(true, strings2.bobThere("ksjdfkljb3blksjafdkjsdf"))
        assertEquals(true, strings2.bobThere("bxbjdfkljb3blksjafdkjsdf"))
        assertEquals(true, strings2.bobThere("jdfkljb3blksjafdkjsdfb3b"))
        assertEquals(false, strings2.bobThere("jdfkljblksjafdkjsdfb"))
    }
}
