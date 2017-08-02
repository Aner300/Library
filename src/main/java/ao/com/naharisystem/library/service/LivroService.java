package ao.com.naharisystem.library.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.com.naharisystem.library.model.Livro;
import ao.com.naharisystem.library.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	LivroRepository livroRepository;
	
	public Livro registaLivro(Livro livro){
		
		return livroRepository.save(livro);
	}
	
	public Collection<Livro> pesquisarTodos(){
		return livroRepository.findAll();
	}
	
	public Livro pesquisarPorId(Integer id){
		
		return livroRepository.findOne(id);
	}

}
