
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.Livre;

import javax.persistence.EntityManager;

public class TestJpa {

	public static final Logger LOG = LoggerFactory.getLogger("STDOUT");

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFact = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFact.createEntityManager();
		
		int idSearched = 3;
		String titleSearched = "Germinal";
		Livre l1 = em.find(Livre.class, idSearched);
		LOG.info(l1.ToString());	
		
		TypedQuery<Livre> query1 = em.createQuery("from Livre where titre=:titleSearched ", Livre.class);
		query1.setParameter("titleSearched", titleSearched);
		Livre l2 = query1.getResultList().get(0);
		LOG.info(l2.ToString());
		
		em.close();
		entityManagerFact.close();
	}

}
