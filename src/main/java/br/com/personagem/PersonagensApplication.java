package br.com.personagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
			title = "API - Personagens Icônicos Dos Games.",
			version = "1.0",
			description = "Documentando uma API para personagens de games.",
			contact = @Contact(name = "Carlos Roberto", email = "crrsj1@gmail.com")
		)
	)
public class PersonagensApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonagensApplication.class, args);
	}

}
