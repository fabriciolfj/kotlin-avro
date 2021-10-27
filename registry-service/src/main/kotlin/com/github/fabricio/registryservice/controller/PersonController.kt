package com.github.fabricio.registryservice.controller

import com.github.fabricio.registryservice.schema.PersonAvro
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/persons")
class PersonController {

    fun sendRecord() {
        var avro = PersonAvro.newBuilder().build();
    }
}