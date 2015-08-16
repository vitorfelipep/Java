package modelo;

import java.util.List;

import modelo.Setor;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class SetorDAO {
	
private Session session;
	
	public SetorDAO(){
		session = HibernateUtil.openSession();
	}
	
	public void salvar(Setor s){
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Setor> todos(){
		return session.createCriteria(Setor.class).list();
	}

}
