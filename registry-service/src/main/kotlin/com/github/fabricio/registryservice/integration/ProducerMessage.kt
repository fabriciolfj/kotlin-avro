package com.github.fabricio.registryservice.integration

import com.github.fabricio.registryservice.domain.Person
import com.github.fabricio.registryservice.domain.toAvro
import com.github.fabricio.registryservice.schema.PersonAvro
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class ProducerMessage {

    val logger = LoggerFactory.getLogger(ProducerMessage::class.java)

    @Autowired
    private lateinit var kafkaTemplate: KafkaTemplate<String, PersonAvro>

    @Value("\${kafka.fraud}")
    private lateinit var topic: String

    @Transactional
    fun execute(person: Person) {
        logger.info("Send msg to topic: {}", topic)
        kafkaTemplate.send(topic,  person.toAvro())
    }
}