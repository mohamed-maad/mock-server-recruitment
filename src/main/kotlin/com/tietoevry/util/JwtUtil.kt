package com.tietoevry.util

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.tietoevry.dto.Settings
import java.util.*

object JwtUtil {
    fun generateToken(username: String, settings: Settings, duration: Int = 300000): String {
        return JWT.create()
            .withAudience(settings.jwtAudience)
            .withIssuer(settings.jwtIssuer)
            .withClaim("username", username)
            .withExpiresAt(Date(System.currentTimeMillis() + duration))
            .sign(Algorithm.HMAC256(settings.jwtSecret))
    }
}