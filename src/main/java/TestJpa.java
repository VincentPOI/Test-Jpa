
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.core.net.server.Client;
import entity.Emprunt;
import entity.Livre;

public class TestJpa {

	public static final Logger LOG = LoggerFactory.getLogger("dev.console");

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFact = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFact.createEntityManager();
		
		int idSearched = 3;
		String titleSearched = "Germinal";
		Livre l1 = em.find(Livre.class, idSearched);
		LOG.info(l1.toString());	
		
		TypedQuery<Livre> query1 = em.createQuery("from Livre where titre=:titleSearched ", Livre.class);
		query1.setParameter("titleSearched", titleSearched);
		Livre l2 = query1.getResultList().get(0);
		LOG.info(l2.toString());
		
//		TypedQuery<Emprunt> queryc = em.createQuery("select e from Emprunt where e.ID=1 ", Emprunt.class);		
//		Emprunt e1 = queryc.getResultList().get(0);
		Emprunt e1 = em.find(Emprunt.class, 1);		
		LOG.info(e1.toString());
		for (Livre l : e1.getLivres()){
			LOG.info(l.toString());
		}
		
		LOG.info("*************************");
		
		entity.Client c1 = em.find(entity.Client.class, 1);
		LOG.info(c1.toString());
		for (Emprunt e : c1.getEmprunts()){
			LOG.info(e.toString());
		}
		
		em.close();
		entityManagerFact.close();
	}

}
