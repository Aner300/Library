package ao.com.naharisystem.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Livro {

	@Id @GeneratedValue
	private Integer Id;
	@Column
	private String titulo;
	@Column
	private String descricao;
}
