package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Integer id_usuario;
	
	private String nome_usuario;
	private String login_usuario;
	private String senha_usuario;
	private String setor_usuario;
	
	public Usuario(){
		
	}
	
	public Usuario(Integer id_usuario, String nome_usuario,
			String login_usuario, String senha_usuario, String setor_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.login_usuario = login_usuario;
		this.senha_usuario = senha_usuario;
		this.setor_usuario = setor_usuario;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getLogin_usuario() {
		return login_usuario;
	}

	public void setLogin_usuario(String login_usuario) {
		this.login_usuario = login_usuario;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	public String getSetor_usuario() {
		return setor_usuario;
	}

	public void setSetor_usuario(String setor_usuario) {
		this.setor_usuario = setor_usuario;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nome_usuario="
				+ nome_usuario + ", login_usuario=" + login_usuario
				+ ", senha_usuario=" + senha_usuario + ", setor_usuario="
				+ setor_usuario + "]";
	}
	

}
