package com.logrex.service.impl;

import com.logrex.dto.TodoDto;
import com.logrex.entity.Todo;
import com.logrex.repository.TodoRepo;
import com.logrex.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceIMPL implements TodoService {

    @Autowired
private TodoRepo todoRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public TodoDto postTOdo(TodoDto todoDto) {

        Todo todo= modelMapper.map(todoDto,Todo.class);

        todoRepo.save(todo);

        TodoDto returnTodoDto=modelMapper.map(todo,TodoDto.class);
        return returnTodoDto;
    }

    @Override
    public TodoDto getById(Integer id) {

        Todo todo= todoRepo.findById(id).orElseThrow(()->new RuntimeException("User not found by given id"));

        return modelMapper.map(todo,TodoDto.class);
    }

    @Override
    public List<TodoDto> findAll() {

        List<Todo> todos=todoRepo.findAll();
       List<TodoDto> todoDto=todos.stream().map((todo)->modelMapper.map(todo,TodoDto.class)).collect(Collectors.toList());
        return todoDto;
    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto, int id) {

         Todo todo=todoRepo.findById(id).orElseThrow(()-> new RuntimeException("User did't find given by id"));

         todo.setTitle(todoDto.getTitle());
         todo.setDescriotions(todoDto.getDescriotions());
         todo.setCompleted(todoDto.isComplete());
        todoRepo.save(todo);
        return modelMapper.map(todo,TodoDto.class);
    }

    @Override
    public void deleteById(int id) {

        Todo todo= todoRepo.findById(id).orElseThrow(()-> new RuntimeException("The user are not exist given by id"+id));
        todoRepo.delete(todo);

    }

    @Override
    public TodoDto complete(int id) {

        Todo todo= todoRepo.findById(id).orElseThrow(()-> new RuntimeException("User aren't exidt find by id"+id));
        todo.setCompleted(Boolean.TRUE);
        Todo todo1= todoRepo.save(todo);

        return modelMapper.map(todo1,TodoDto.class);
    }


}
