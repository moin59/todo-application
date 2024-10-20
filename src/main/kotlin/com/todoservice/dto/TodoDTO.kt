package com.todoservice.dto

import jakarta.validation.constraints.NotBlank
import java.util.*

data class TodoDTO (
    val id: UUID? = UUID.randomUUID(),

    @NotBlank(message = "name must not be blank")
    val name: String,
    val description: String
)