package br.com.personagem.dominio;



import br.com.personagem.dto.PersonagemDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_personagens")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Personagem {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(max = 500)
	private String url;
	private String nome;
	private String game;
	private String plataforma;
	
	public Personagem(PersonagemDto personagemDto) {
		this.url = personagemDto.url();
		this.nome = personagemDto.nome();
		this.game = personagemDto.game();
		this.plataforma = personagemDto.plataforma();
		
	}
	

}
