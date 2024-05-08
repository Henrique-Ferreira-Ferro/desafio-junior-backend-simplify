package com.desafio.desafioSimplify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.desafioSimplify.entities.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long>{
	
	
}
