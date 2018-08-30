package gonza.integracionWeb.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import gonza.integracionWeb.model.Alumno;

public class AlumnoService implements ManagerService {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
	private EntityManager manager = emf.createEntityManager();
	
	public void addEntity(Object entity) {

		manager.getTransaction().begin();
		
		manager.persist(entity);
		
		manager.getTransaction().commit();
		
	}

	public List<Object> getAllEntities() {
		manager.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Object> alumnos = manager.createQuery("FROM Alumno").getResultList();
		manager.getTransaction().commit();
		return alumnos;
	}
	
	public Alumno getEntity(Long primaryKey)
	{
		manager.getTransaction().begin();
		Alumno a = manager.find(Alumno.class, primaryKey);
		manager.getTransaction().commit();
		return a;
	}

}
