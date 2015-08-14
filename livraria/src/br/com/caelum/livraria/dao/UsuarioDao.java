package br.com.caelum.livraria.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Usuario;

@Stateless
public class UsuarioDao {

	@PersistenceContext
	 private EntityManager manager;

	 public Usuario buscaPeloLogin(String login) {
	  try {
	   
	   return this.manager.createQuery("Select u from Usuario u where u.login like :pLogin", Usuario.class).
	     setParameter("pLogin", login).
	      getSingleResult();
	   
	  } catch (Exception e) {
	   return null;
	  }
	 
	 }
	
}
