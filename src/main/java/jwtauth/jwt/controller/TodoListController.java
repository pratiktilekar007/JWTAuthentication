package jwtauth.jwt.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jwtauth.jwt.entity.TodoList;
import jwtauth.jwt.service.TodoListServiceImpl;

@RestController
public class TodoListController {
	
	private TodoListServiceImpl todoListServiceImpl;

	public TodoListController(TodoListServiceImpl todoListServiceImpl) {
		// TODO Auto-generated constructor stub
		this.todoListServiceImpl = todoListServiceImpl;
	}
	
	@PostMapping("/createtodolist")
	public ResponseEntity<?> create(@RequestBody TodoList list) {
	    try {
	    	 TodoList responselist =  todoListServiceImpl.saveTodoList(list);
	        return ResponseEntity.ok(responselist);
	    } catch (Exception e) {
	        e.printStackTrace(); // This WILL print the real error to your console
	        return ResponseEntity.status(500).body(e.getMessage());
	    }
	}
	
	@GetMapping("/getalltodolist")
	public List<TodoList> getAllList(){
		
		return this.todoListServiceImpl.getAllTodoList();
	}
}
