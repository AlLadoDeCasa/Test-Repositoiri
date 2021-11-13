package com.sdeaqui.test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ControllerShould {

    @Test
    fun `validate status is OK`(){
        val controller = Controller()
        val value = controller.getStatus()
        assertEquals("OK",value)
    }
}