package com.roomsplits.shared

object AppInfo {
    const val NAME = "Room Splits"
    const val SERVER_PORT = 8080
}

expect fun platformName(): String

fun greeting(): String = "Hello from ${AppInfo.NAME} on ${platformName()}"
