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

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot", LocalDateTime.parse("19/06/2021 10:40", formartter),
				false);

		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal",
				LocalDateTime.parse("14/06/2021 10:40", formartter), true);

		Todo t3 = new Todo(null, "Exercícios", "Praticar exercicios físicos",
				LocalDateTime.parse("15/06/2021 10:40", formartter), false);

		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã",
				LocalDateTime.parse("20/06/2021 10:40", formartter), true);

		todorepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
