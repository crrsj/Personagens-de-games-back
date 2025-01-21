package br.com.personagem.dto;

import br.com.personagem.dominio.Personagem;

public record BuscarPersonagem(Long id,String url,String nome, String game,String plataforma) {
	public BuscarPersonagem(Personagem personagem) {
		this(personagem.getId(),personagem.getUrl(),personagem.getNome(),personagem.getGame(),personagem.getPlataforma());
	}

}
