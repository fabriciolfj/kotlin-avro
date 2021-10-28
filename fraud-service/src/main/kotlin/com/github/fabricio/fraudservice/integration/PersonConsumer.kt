package com.github.fabricio.fraudservice.integration

import com.github.fabricio.registryservice.schema.PersonAvro
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.Acknowledgment
import org.springframework.stereotype.Component

@Component
class PersonConsumer {

    val logger = LoggerFactory.getLogger(PersonConsumer::class.java)

    @KafkaListener(topics = ["\${kafka.fraud}"], groupId = "\${spring.kafka.consumer.group-id}")
    fun execute(person: PersonAvro, ack: Acknowledgment) {
        try {
            logger.info("Consumer: {}", person.toString())
            ack.acknowledge()
        } catch (e: Exception) {
            logger.error(e.message)
        }
    }
}