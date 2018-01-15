package entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Clientb {

	@Id
	private int id;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	@ManyToOne
	@JoinColumn(name="ID_BANQUE")
	private Banque banque;
	
	@Embedded
	private Adresse adresse; 
	
	@ManyToMany
	@JoinTable(name="COMP",
	joinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName="ID")
	)
	private Set<Compte> comptes;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Clientb() {
		comptes = new HashSet<Compte>();
	}

}
