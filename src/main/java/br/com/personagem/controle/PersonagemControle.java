package br.com.personagem.controle;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.personagem.dominio.Personagem;
import br.com.personagem.dto.BuscarPersonagem;
import br.com.personagem.dto.PersonagemDto;
import br.com.personagem.servico.PersonagemServico;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/personagem")
@RequiredArgsConstructor
@CrossOrigin(origins =  "*")
public class PersonagemControle {

	private final PersonagemServico servico;
	
	
	@PostMapping
	@Operation(summary = "Endpoint responsável por cadastrar personagens.") 
    @ApiResponse(responseCode = "201",description = " sucesso",content = {
   	@Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })          
	public ResponseEntity<Personagem>cadastarPersonagem(@RequestBody PersonagemDto personagemDto){
		var cadastrar = servico.cadastrarPersonagem(personagemDto);
		return new ResponseEntity<>(cadastrar,HttpStatus.CREATED);
	}
	
	@GetMapping
	@Operation(summary = "Endpoint responsável pela busca dos personagens.") 
    @ApiResponse(responseCode = "200",description = " sucesso",content = {
   	@Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })           
	public ResponseEntity<List<BuscarPersonagem>>listarPersonagens(){
		var buscar = servico.listarPersonagens();
		return new ResponseEntity<>(buscar,HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	@Operation(summary = "Endpoint responsável por excluir personagens.") 
    @ApiResponse(responseCode = "204",description = " sucesso",content = {
   	@Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })           
	public ResponseEntity<Void>excluirGame(@PathVariable Long id){
		 servico.excluirGame(id);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	
}	
	