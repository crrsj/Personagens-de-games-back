package br.com.personagem.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.personagem.dominio.Personagem;
import br.com.personagem.dto.BuscarPersonagem;
import br.com.personagem.dto.PersonagemDto;
import br.com.personagem.repositorio.PersonagemRepositorio;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonagemServico {

	private final PersonagemRepositorio repositorio;
	
	public Personagem cadastrarPersonagem(PersonagemDto personagemDto) {
		var cadastrar = new Personagem(personagemDto);
		return repositorio.save(cadastrar);
	}
	
	public List<BuscarPersonagem>listarPersonagens(){
		return repositorio.findAll().stream().map(BuscarPersonagem::new).toList();
				
	}
	
	public void excluirGame(Long id) {
		repositorio.deleteById(id);
	}
	
}
