package co.wrisk.lookupdsl

import org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngineFactory
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LookupContextTest {

    @Test
    fun `script evaluation should return function defined in the script`() {
        val scriptEngine = KotlinJsr223JvmLocalScriptEngineFactory().scriptEngine

        val script = "{1 + 2}"
        val result = scriptEngine.eval(script)

        assertTrue(result is Function0<*>)
        assertEquals(3, result.invoke())

    }

}
