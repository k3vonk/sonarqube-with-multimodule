import com.gajyoung.Bye
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ByeTest {
    @Test
    fun `byebyebye test`() {
        assertEquals("byebyebye", Bye().byebyebye())
    }
}