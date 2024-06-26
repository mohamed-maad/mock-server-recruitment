package com.tietoevry.util

import com.tietoevry.dto.Settings
import kotlinx.serialization.json.Json
import java.io.File

object SettingsUtil {
    fun readSettingsFromJson(filePath: String): Settings {
        val jsonString = File(filePath).readText()
        return Json.decodeFromString(jsonString)
    }
}