package ao.com.naharisystem.library.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ao.com.naharisystem.library.model.Livro;
import ao.com.naharisystem.library.service.LivroService;


@RestController
@RequestMapping
public class LivroController {
	
	@Autowired
	LivroService livroService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/registar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Livro> registaLivro(@RequestBody Livro livro){
		
		Livro livroRegistado = livroService.registaLivro(livro);
		
		return new ResponseEntity<>(livroRegistado, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/pesquisarLivro", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Livro>> buscarTodosLivros() {

		Collection<Livro> livroPesquisados = livroService.pesquisarTodos();

		return new ResponseEntity<>(livroPesquisados, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/procurar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Livro> procurarLivroPorId(@PathVariable Integer id) {

		Livro livro = livroService.pesquisarPorId(id);

		return new ResponseEntity<>(livro, HttpStatus.OK);
	}

}
