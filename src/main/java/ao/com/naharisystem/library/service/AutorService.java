package ao.com.naharisystem.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.com.naharisystem.library.model.Autor;
import ao.com.naharisystem.library.repository.AutorRepository;

@Service
public class AutorService {

	@Autowired
	AutorRepository autorRepository;
	
	public Autor registaAutor(Autor autor){
		return autorRepository.save(autor);
	}
}
