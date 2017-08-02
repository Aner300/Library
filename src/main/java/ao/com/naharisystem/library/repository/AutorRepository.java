package ao.com.naharisystem.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.com.naharisystem.library.model.Autor;

public interface AutorRepository extends JpaRepository<Autor,Integer> {

}
