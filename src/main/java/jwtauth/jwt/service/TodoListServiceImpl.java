package jwtauth.jwt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jwtauth.jwt.entity.TodoList;
import jwtauth.jwt.repository.TodoRepository;

@Service
public class TodoListServiceImpl {

	private TodoRepository todoRepository;
	
	public TodoListServiceImpl(TodoRepository todoRepository) {
		this.todoRepository= todoRepository;
		// TODO Auto-generated constructor stub
	}
	
	public TodoList saveTodoList(TodoList todoList) {
		
		TodoList tList = this.todoRepository.save(todoList);
		return tList;
	}
	
	public List<TodoList> getAllTodoList(){
		return this.todoRepository.findAll();
	}
}
