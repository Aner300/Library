package ao.com.naharisystem.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ao.com.naharisystem.library.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Integer>{

}
