package com.wolenberg.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolenberg.todo.domain.Todo;
import com.wolenberg.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todorepository;

	public void instanciaBasedeDados() {

		DateTimeFormatter formartter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot", LocalDateTime.parse("10/06/2021 10:40", formartter),
				false);

		todorepository.saveAll(Arrays.asList(t1));
		todorepository.save(t1);
	}
}
