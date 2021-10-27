package com.github.fabricio.registryservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RegistryServiceApplication

fun main(args: Array<String>) {
	runApplication<RegistryServiceApplication>(*args)
}
