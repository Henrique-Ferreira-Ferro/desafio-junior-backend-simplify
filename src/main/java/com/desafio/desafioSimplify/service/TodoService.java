package com.desafio.desafioSimplify.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.desafio.desafioSimplify.entities.TodoEntity;
import com.desafio.desafioSimplify.repository.TodoRepository;

@Service
public class TodoService {
	
	
	TodoRepository repository;
	
	public TodoService(TodoRepository repository) {
		this.repository = repository;
	}
		
		
	public List<TodoEntity> create(TodoEntity entity){
		 repository.save(entity);
		 return list();
	}
	
	public List<TodoEntity> list(){
		
		Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
		
		return repository.findAll(sort);
		
	}
	
	public List<TodoEntity> update(TodoEntity todo){
		repository.save(todo);
		return list();
	}
	
	public List<TodoEntity> delete(Long id){
		repository.deleteById(id);
		return list();
	}
	
}
