package com.alpertign.plugins

import com.alpertign.routes.getAllHeroes
import com.alpertign.routes.root
import com.alpertign.routes.searchHeroes
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()
        static ("/images"){
            resources("images")
        }
    }
}
