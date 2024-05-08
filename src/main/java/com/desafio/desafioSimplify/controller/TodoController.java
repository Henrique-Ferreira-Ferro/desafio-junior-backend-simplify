package com.desafio.desafioSimplify.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.desafioSimplify.entities.TodoEntity;
import com.desafio.desafioSimplify.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
	
	private TodoService service;
	
	public TodoController(TodoService service) {
		this.service = service;
	}
	
	@PostMapping
	public List<TodoEntity> create(@RequestBody @Validated TodoEntity todo){
		return service.create(todo);
	}
	
	@GetMapping
	public List<TodoEntity> list(){
		return service.list();
	}
	
	@PutMapping
	public List<TodoEntity> update(@RequestBody TodoEntity todo){
		return service.update(todo);
	}
	
	@DeleteMapping("{id}")
	public List<TodoEntity> delete(@PathVariable("id") Long id){
		return service.delete(id);
	}
	
	
}
