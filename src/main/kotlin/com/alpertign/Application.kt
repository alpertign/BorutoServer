package com.alpertign

import io.ktor.server.application.*
import com.alpertign.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureSerialization()
    configureMonitoring()
    configureRouting()
    configureDefaultHeader()
}
