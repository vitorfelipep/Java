package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sf;
	
	private static void configuraSessionFactory(){
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder build= new StandardServiceRegistryBuilder();
		build.applySettings(cfg.getProperties());
		ServiceRegistry reg = build.build();
		sf = cfg.buildSessionFactory(reg);
	}
	
	public static Session openSession(){
		if(sf == null)
			configuraSessionFactory();
		return sf.openSession();
	}
	

}
