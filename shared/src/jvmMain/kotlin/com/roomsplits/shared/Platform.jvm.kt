package com.roomsplits.shared

actual fun platformName(): String = "JVM ${System.getProperty("java.version")}"
