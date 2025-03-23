package org.example.sof3061.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.sof3061.dto.TodoDto;
import org.example.sof3061.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoDto> addTodo(@Valid @RequestBody TodoDto todoDto) {

        TodoDto savedTodoDto = todoService.addTodo(todoDto);

        return new ResponseEntity<TodoDto>(savedTodoDto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoDto> getTodo(@PathVariable("id") long todoId) {

        TodoDto todoDto = todoService.getTodo(todoId);

        return new ResponseEntity<>(todoDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodos() {

        List<TodoDto> todos = todoService.getAllTodos();

        //return new ResponseEntity<>(todos, HttpStatus.OK);
        return ResponseEntity.ok(todos);
    }

    @PutMapping("{id}")
    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto, @PathVariable("id") long todoId) {

        TodoDto updateTodo = todoService.updateTodo(todoDto, todoId);

        return ResponseEntity.ok(updateTodo);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable("id") long todoId) {

        todoService.deleteTodo(todoId);

        return ResponseEntity.ok("Successfully deleted todo with id: " + todoId);
    }
}
