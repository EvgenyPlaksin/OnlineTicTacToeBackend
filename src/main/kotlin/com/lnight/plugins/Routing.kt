package com.lnight.plugins

import com.lnight.models.TicTacToeGame
import com.lnight.socket
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}
