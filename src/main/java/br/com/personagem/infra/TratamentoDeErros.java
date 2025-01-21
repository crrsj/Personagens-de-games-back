package br.com.personagem.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.personagem.dto.ValidandoCampos;

@ControllerAdvice
public class TratamentoDeErros {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?>validarCampos(MethodArgumentNotValidException exception){
		
		var validar = exception.getFieldErrors();
		
		return ResponseEntity.badRequest().body(validar.stream().map(ValidandoCampos::new).toList());
	}
}
