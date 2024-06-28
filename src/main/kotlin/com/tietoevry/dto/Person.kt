package com.tietoevry.dto

import kotlinx.serialization.Serializable

@Serializable
data class Person(
    val name: String,
    val socSecNum: String,
    val address: String,
    val email: String,
    val phone: String,
)
