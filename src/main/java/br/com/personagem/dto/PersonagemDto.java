package br.com.personagem.dto;

import jakarta.validation.constraints.NotBlank;

public record PersonagemDto(
		@NotBlank(message = "Não pode estar em branco.") 
		String url,
		@NotBlank(message = "Não pode estar em branco.") 
        String nome,
		@NotBlank(message = "Não pode estar em branco.") 
        String game,
		@NotBlank(message = "Não pode estar em branco.")  
		String plataforma) {

}
