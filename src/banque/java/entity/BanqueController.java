package entity;
import java.time.LocalDate;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BanqueController {
	public static final Logger LOG = LoggerFactory.getLogger("dev.console");
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFact = Persistence.createEntityManagerFactory("pu_banque");
		EntityManager em = entityManagerFact.createEntityManager();
		
		Adresse a1 = new Adresse();
		a1.setCodePostal(44400);
		a1.setVille("Reze");
		a1.setRue("rue vincent van gogh");
		a1.setNumero(12);
		
		Banque b1 = new Banque();
		b1.setNom("CMB");
			
		Compte cmpt1 = new Compte();
		cmpt1.setNom("compte cheque");
		cmpt1.setSolde(999999999);
		
		LivretA cmpt2 = new LivretA();
		cmpt2.setNom("livret bleu");
		cmpt2.setSolde(999999);
		cmpt2.setTaux(0.01);
		
		
		Clientb c1 = new Clientb();
		c1.setNom("POISSON");
		c1.setPrenom("Vincent");
		c1.setDateNaissance(LocalDate.of(1994, 11, 8));
		c1.setAdresse(a1);
		c1.setBanque(b1);
		HashSet<Compte> listeb = new HashSet<Compte>();
		listeb.add(cmpt1);
		listeb.add(cmpt2);
		c1.setComptes(listeb);
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(c1);
		em.persist(cmpt1);
		em.persist(cmpt2);
		em.persist(b1);
		em.persist(a1);
		transaction.commit();
		
		
		em.close();
		entityManagerFact.close();

	}

}
