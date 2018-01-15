import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BanqueController {
	public static final Logger LOG = LoggerFactory.getLogger("dev.console");
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFact = Persistence.createEntityManagerFactory("pu_banque");
		EntityManager em = entityManagerFact.createEntityManager();
		
		
		
		
		em.close();
		entityManagerFact.close();

	}

}
