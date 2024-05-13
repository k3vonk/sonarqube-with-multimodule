import com.gajyoung.childModuleCA
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun `hello test`() {
        assertEquals("hello", childModuleCA())
    }
}