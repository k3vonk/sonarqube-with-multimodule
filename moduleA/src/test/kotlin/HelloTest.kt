import com.gajyoung.moduleA
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloTest {

    @Test
    fun `hello test`() {
        assertEquals("hello", moduleA())
    }
}