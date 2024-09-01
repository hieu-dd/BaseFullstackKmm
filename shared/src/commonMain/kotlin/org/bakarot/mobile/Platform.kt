package org.bakarot.mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform