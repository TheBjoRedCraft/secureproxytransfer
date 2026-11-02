package dev.thebjoredcraft.secureproxytransfer.common

import dev.thebjoredcraft.secureproxytransfer.common.mode.SecureMode
import java.nio.file.Path

interface SecureInstance {
    fun getMode(): SecureMode

    fun dataPath(): Path
    fun platform(): String

    suspend fun launch()
}