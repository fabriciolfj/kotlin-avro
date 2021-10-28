package com.github.fabricio.registryservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@EnableKafka
@SpringBootApplication
class RegistryServiceApplication

fun main(args: Array<String>) {
	runApplication<RegistryServiceApplication>(*args)
}
