package com.roomsplits.server

import com.roomsplits.shared.AppInfo
import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun main() {
    embeddedServer(Netty, port = AppInfo.SERVER_PORT, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    routing {
        get("/") { call.respondText("${AppInfo.NAME} API") }
        get("/health") { call.respondText("OK") }
    }
}
