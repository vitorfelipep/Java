package modelo;

import java.util.List;

import modelo.Usuario;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class UsuarioDAO {
	
	private Session session;
	
	public UsuarioDAO(){
		session = HibernateUtil.openSession();
	}
	
	public void salvar(Usuario u){
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
	}
	
	public void atualizar(Usuario u){
		session.beginTransaction();
		session.update(u);
		session.getTransaction().commit();
	}
	
	public void apagar(Usuario u){
		session.beginTransaction();
		session.delete(u);
		session.getTransaction().commit();
	}
	
	public Usuario getUsuario(Integer codigo){
		return (Usuario)session.get(Usuario.class, codigo);
	}
	
	public List<Usuario> todos(){
		return session.createCriteria(Usuario.class).list();
	}

}
