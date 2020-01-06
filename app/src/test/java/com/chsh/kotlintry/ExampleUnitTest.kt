package com.chsh.kotlintry

import com.chsh.kotlintry.test.no
import com.chsh.kotlintry.test.otherwise
import com.chsh.kotlintry.test.yes
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testBoolean() {
        val result = true.yes {
            1
        }.otherwise {
            3
        }


        val result2 = false.yes {
            1
        }.otherwise {
            3
        }


        val result3 = true.no {

        }.otherwise {

        }
    }


    fun getABoolean() = false


}
