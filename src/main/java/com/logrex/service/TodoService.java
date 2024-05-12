package com.logrex.service;

import com.logrex.dto.TodoDto;

import java.util.List;

public interface TodoService {

      public TodoDto postTOdo(TodoDto todoDto);
     public  TodoDto getById(Integer id);

     public List<TodoDto> findAll();

     public  TodoDto updateTodo(TodoDto todoDto,int id);

     public  void  deleteById( int id);

     public  TodoDto complete(int id);


}
