package ao.com.naharisystem.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ao.com.naharisystem.library.model.Autor;
import ao.com.naharisystem.library.service.AutorService;

@RestController
@RequestMapping
public class AutorController {

	@Autowired
	AutorService autorService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/cadastrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Autor> registarAutor(@RequestBody Autor autor){
		
		Autor autorRegistado = autorService.registaAutor(autor);
		
		
		return new ResponseEntity<>(autorRegistado, HttpStatus.CREATED);
	}
}
