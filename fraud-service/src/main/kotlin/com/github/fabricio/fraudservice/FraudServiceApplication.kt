package com.github.fabricio.fraudservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FraudServiceApplication

fun main(args: Array<String>) {
	runApplication<FraudServiceApplication>(*args)
}
