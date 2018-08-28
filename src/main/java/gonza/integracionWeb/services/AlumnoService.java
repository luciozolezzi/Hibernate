package gonza.integracionWeb.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlumnoService implements ManagerService {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
	private EntityManager manager = emf.createEntityManager();
	
	public void addEntity(Object entity) {

		manager.getTransaction().begin();
		
		manager.persist(entity);
		
		manager.getTransaction().commit();
		
	}

}
