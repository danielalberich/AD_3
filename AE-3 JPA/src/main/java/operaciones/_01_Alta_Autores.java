package operaciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entidad.Autor;

public class _01_Alta_Autores {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Actividad3");
			
		EntityManager em = null;	
		
		
		Autor a1 = new Autor(null, "Jorge", "Hernandez", null);
		Autor a2 = new Autor(null, "Armando", "Serrano", null);
		Autor a3 = new Autor(null, "Pilar", "Morillo", null);
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		
		em.getTransaction().commit(); 
		em.close();		
		
		emf.close();		
	}
}
