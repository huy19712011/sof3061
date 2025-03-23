package org.example.sof3061.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sof3061.dto.TodoDto;
import org.example.sof3061.entity.Todo;
import org.example.sof3061.exception.ResourceNotFoundException;
import org.example.sof3061.repository.TodoRepository;
import org.example.sof3061.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;
    private final ModelMapper modelMapper;

    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        // convert TodoDto into Todo
        /*
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        todo.setCompleted(todoDto.isCompleted());
        */

        Todo todo = modelMapper.map(todoDto, Todo.class);

        // Todo
        Todo savedTodo = todoRepository.save(todo);

        // convert savedTodo into Todo
        /*
        TodoDto savedTodoDto = new TodoDto();
        savedTodoDto.setId(savedTodo.getId());
        savedTodoDto.setTitle(savedTodo.getTitle());
        savedTodoDto.setDescription(savedTodo.getDescription());
        savedTodoDto.setCompleted(savedTodo.isCompleted());
        */

        TodoDto savedTodoDto = modelMapper.map(savedTodo, TodoDto.class);

        //
        return savedTodoDto;
    }

    @Override
    public TodoDto getTodo(long id) {

        //Todo todo = todoRepository.findById(id).get();
        
        Todo todo = todoRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));


        return modelMapper.map(todo, TodoDto.class);
    }
}
