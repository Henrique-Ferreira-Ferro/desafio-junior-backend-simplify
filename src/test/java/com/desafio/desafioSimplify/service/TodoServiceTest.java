package com.desafio.desafioSimplify.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.desafio.desafioSimplify.repository.TodoRepository;

@RunWith(MockitoJUnitRunner.class)
public class TodoServiceTest {
	
	@Mock
	TodoRepository repository;
	
	@InjectMocks
	TodoService service;
	
	@Test
	public void SholdCreateToDo(){	
	}
	
	@Test
	public void SholdReturnAllToDo() {
	}
	
	@Test
	public void SholdUpdateToDo() {
	}
	
	@Test
	public void SholdDeleteToDo() {
	}
	
	@Test
	public void SholdReturnOneToDo() {
	}
	
	
	/*cenarios de erro*/
	
	@Test
	public void SholdCreateToDoError(){	
	}
	
	@Test
	public void SholdReturnAllToDoError() {
	}
	
	@Test
	public void SholdUpdateToDoError() {
	}
	
	@Test
	public void SholdDeleteToDoError() {
	}

	@Test
	public void SholdReturnOneToDoError() {
	
	}
	
}
