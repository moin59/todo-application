package com.todoservice.controller

import com.todoservice.dto.TodoDTO
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*
import java.util.UUID


@RestController
@RequestMapping("/v1/todos")
class TodoController {

    @PostMapping()
    fun createTodo(@RequestBody @Valid todoDTO: TodoDTO):TodoDTO {
        println("Todo created")
        return todoDTO
    }

    @GetMapping()
    fun getTodos(): String{
     
        return "hello todo"
    }

    @PutMapping("/{id}")
    fun updateTodo(@RequestBody @Valid todoDTO: TodoDTO, @PathVariable("id") id: UUID): TodoDTO {
        return todoDTO
    }

    @DeleteMapping("/{id}")
    fun deleteTodoById(@PathVariable("id") id: UUID): Any {
        return "Todo Deleted"
    }

}