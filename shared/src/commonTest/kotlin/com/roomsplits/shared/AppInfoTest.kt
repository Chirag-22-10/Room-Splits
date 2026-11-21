package com.roomsplits.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class AppInfoTest {
    @Test
    fun greetingMentionsAppAndPlatform() {
        val text = greeting()
        assertTrue(text.contains(AppInfo.NAME))
        assertTrue(text.contains(platformName()))
    }
}
