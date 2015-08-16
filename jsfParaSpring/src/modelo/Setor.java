package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="setor")
public class Setor {
	
	@Id
	@GeneratedValue
	private Integer id_setor;
	private String nome_setor;
	
	public Setor(){
		
	}

	public Setor(Integer id_setor, String nome_setor) {
		super();
		this.id_setor = id_setor;
		this.nome_setor = nome_setor;
	}

	public Integer getId_setor() {
		return id_setor;
	}

	public void setId_setor(Integer id_setor) {
		this.id_setor = id_setor;
	}

	public String getNome_setor() {
		return nome_setor;
	}

	public void setNome_setor(String nome_setor) {
		this.nome_setor = nome_setor;
	}

	@Override
	public String toString() {
		return nome_setor;
	}
	
	

}
