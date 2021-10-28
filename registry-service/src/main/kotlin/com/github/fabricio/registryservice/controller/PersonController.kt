package com.github.fabricio.registryservice.controller

import com.github.fabricio.registryservice.controller.dto.PersonDTO
import com.github.fabricio.registryservice.controller.dto.toDomain
import com.github.fabricio.registryservice.integration.ProducerMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/persons")
class PersonController {

    @Autowired
    private lateinit var producerMessage: ProducerMessage

    @PostMapping
    fun sendRecord(@RequestBody dto: PersonDTO) {
        producerMessage.execute(dto.toDomain())
    }
}