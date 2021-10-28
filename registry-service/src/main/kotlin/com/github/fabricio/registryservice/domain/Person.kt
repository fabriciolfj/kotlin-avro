package com.github.fabricio.registryservice.domain

import com.github.fabricio.registryservice.schema.PersonAvro
import java.util.*

data class Person(var name: String, var lastname: String, var uuid: String)

fun Person.toAvro() : PersonAvro {
    return PersonAvro
            .newBuilder()
            .setFirstName(this.name)
            .setLastName(this.lastname)
            .setUuid(this.uuid)
            .build();
}