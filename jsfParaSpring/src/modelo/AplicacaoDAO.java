package modelo;

import java.util.List;

import modelo.Aplicacao;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class AplicacaoDAO {
		
private Session session;
	
	public AplicacaoDAO(){
		session = HibernateUtil.openSession();
	}
	
	public void salvar(Aplicacao a){
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
	}
	
	public void atualizar(Aplicacao a){
		session.beginTransaction();
		session.update(a);
		session.getTransaction().commit();
	}
	
	public void apagar(Aplicacao a){
		session.beginTransaction();
		session.delete(a);
		session.getTransaction().commit();
	}
	
	public Aplicacao getAplicacao(Integer codigo){
		return (Aplicacao)session.get(Aplicacao.class, codigo);
	}
	
	@SuppressWarnings("unchecked")
	public List<Aplicacao> todos(){
		return session.createCriteria(Aplicacao.class).list();
	}

}
