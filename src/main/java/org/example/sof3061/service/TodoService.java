package org.example.sof3061.service;

import org.example.sof3061.dto.TodoDto;

import java.util.List;

public interface TodoService {

    TodoDto addTodo(TodoDto todoDto);

    TodoDto getTodo(long id);

    List<TodoDto> getAllTodos();

    TodoDto updateTodo(TodoDto todoDto, long id);
}
