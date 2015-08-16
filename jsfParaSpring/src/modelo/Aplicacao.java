package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="aplicacao")
public class Aplicacao {
	
	@Id
	@GeneratedValue
	private Integer id_aplicacao;
	
	private String nome_aplicacao;
	private String descricao_aplicacao;
	private String setor;
	
	public Aplicacao(){
		
	}

	public Aplicacao(Integer id_aplicacao, String nome_aplicacao,
			String descricao_aplicacao, String setor) {
		super();
		this.id_aplicacao = id_aplicacao;
		this.nome_aplicacao = nome_aplicacao;
		this.descricao_aplicacao = descricao_aplicacao;
		this.setor = setor;
	}

	public Integer getId_aplicacao() {
		return id_aplicacao;
	}

	public void setId_aplicacao(Integer id_aplicacao) {
		this.id_aplicacao = id_aplicacao;
	}

	public String getNome_aplicacao() {
		return nome_aplicacao;
	}

	public void setNome_aplicacao(String nome_aplicacao) {
		this.nome_aplicacao = nome_aplicacao;
	}

	public String getDescricao_aplicacao() {
		return descricao_aplicacao;
	}

	public void setDescricao_aplicacao(String descricao_aplicacao) {
		this.descricao_aplicacao = descricao_aplicacao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Aplicacao [id_aplicacao=" + id_aplicacao + ", nome_aplicacao="
				+ nome_aplicacao + ", descricao_aplicacao="
				+ descricao_aplicacao + ", setor=" + setor + "]";
	}
	
	

}
