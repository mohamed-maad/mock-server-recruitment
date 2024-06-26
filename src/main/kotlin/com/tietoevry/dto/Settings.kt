package com.tietoevry.dto

import kotlinx.serialization.Serializable

@Serializable
data class Settings(
    val username: String,
    val password: String,
    val jwtSecret: String,
    val jwtAudience: String,
    val jwtIssuer: String,
    val jwtRealm: String,
)
