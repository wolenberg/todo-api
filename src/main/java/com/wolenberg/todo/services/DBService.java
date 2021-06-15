package com.wolenberg.todo.services;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.el.parser.ParseException;
import com.wolenberg.todo.domain.Todo;
import com.wolenberg.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todorepository;

	public void instanciaBasedeDados() throws ParseException, java.text.ParseException{

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot", sdf.parse("19/06/2021"), false);

		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", sdf.parse("14/06/2021"), true);

		Todo t3 = new Todo(null, "Exercícios", "Praticar exercicios físicos", sdf.parse("15/06/2021"), false);

		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", sdf.parse("20/06/2021"), true);

		todorepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
