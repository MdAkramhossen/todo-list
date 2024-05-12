package com.logrex.restApp;

import com.logrex.dto.TodoDto;
import com.logrex.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoService todoService;


   // @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<TodoDto> postTodo(@RequestBody  TodoDto todoDto){


            TodoDto todoDtos= todoService.postTOdo(todoDto);

         return new ResponseEntity<>(todoDtos, HttpStatus.CREATED);
    }

   // @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/get/{id}")
    public  ResponseEntity<TodoDto> getbyID(@PathVariable int id){

        TodoDto todoDto=todoService.getById(id);
        return  new ResponseEntity<>(todoDto,HttpStatus.OK);
    }

//@PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/findAll")
    public ResponseEntity<List<TodoDto>> getAll(){

       return  ResponseEntity.ok(todoService.findAll());

  }

   // @PreAuthorize("hasRole('ADMIN')")

  @PutMapping("/update/{id}")
    private  ResponseEntity<TodoDto> updateById(@RequestBody TodoDto todoDto,@PathVariable int id){

        return   ResponseEntity.ok(todoService.updateTodo(todoDto,id));
  }

    //@PreAuthorize("hasRole('ADMIN')")
  @DeleteMapping("/delete/{id}")
public  ResponseEntity <String> deleteById(@PathVariable  int id){

        todoService.deleteById(id);

        return ResponseEntity.ok("Sucessfully deleted");

}
//@PreAuthorize("hasAnyRole('ADMIN','USER')")
@PatchMapping("/complete/{id}")
public  ResponseEntity<TodoDto> complete(@PathVariable int id){

        return  ResponseEntity.ok(todoService.complete(id));
}





}
