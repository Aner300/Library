package ao.com.naharisystem.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Autor {

	@Id @GeneratedValue
	private Integer id;
	private String nome;
	private String biografia;
}
