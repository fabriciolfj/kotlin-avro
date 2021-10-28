package com.github.fabricio.registryservice.controller.dto

import com.github.fabricio.registryservice.domain.Person
import java.util.*

data class PersonDTO(var name: String, var lastname: String)

fun PersonDTO.toDomain() : Person {
    return Person(this.name, this.lastname, UUID.randomUUID().toString())
}