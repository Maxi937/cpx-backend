package com.cpx.plugins

import com.yk09.sunvision.cpx.components.document.Document
import com.yk09.sunvision.cpx.fromXml
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.request.receive
import io.ktor.server.request.receiveText
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        post("/document") {
            val body = call.receiveText()
            val document = Document.fromXml(body)
            println("\n")
            document.cpxComponents.forEach(::println)
            call.respondText("Hello World!")
        }
        // Static plugin. Try to access `/static/index.html`
        staticResources("/static", "static")
    }
}
