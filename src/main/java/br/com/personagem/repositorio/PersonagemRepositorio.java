package br.com.personagem.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.personagem.dominio.Personagem;

public interface PersonagemRepositorio extends JpaRepository<Personagem, Long> {

}
