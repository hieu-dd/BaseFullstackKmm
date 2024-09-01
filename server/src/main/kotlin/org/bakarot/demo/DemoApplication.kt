package org.bakarot.demo

import org.bakarot.mobile.Greeting
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {
    @Bean
    fun runCommandLine() = CommandLineRunner {
        val greeting = Greeting()
        println(greeting.greet())
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}