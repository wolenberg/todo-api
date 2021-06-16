package com.wolenberg.todo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sun.el.parser.ParseException;
import com.wolenberg.todo.services.DBService;

@Configuration
@Profile("azure")
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instancia() throws ParseException, java.text.ParseException {
		this.dbService.instanciaBasedeDados();
		return true;
	}

}
