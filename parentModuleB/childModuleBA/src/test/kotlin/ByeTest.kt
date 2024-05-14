import com.gajyoung.Bye
import kotlin.test.Test
import kotlin.test.assertEquals

class ByeTest {
    @Test
    fun `byebye test`() {
        assertEquals("byebye", Bye().byebye())
    }

    @Test
    fun `byeAgain test`() {
        assertEquals("byeAgain", Bye().byeAgain())
    }

    @Test
    fun `byebyeAgain test`() {
        assertEquals("byebyeAgain", Bye().byebyeAgain())
    }
}