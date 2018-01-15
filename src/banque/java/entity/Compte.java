package entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMPTE")
public class Compte {

	@Id
	private int id;
	@Column(name = "NUMERO")
	private String nom;
	@Column(name = "SOLDE")
	private double solde;
	
	@OneToMany(mappedBy="compte")
	private Set<Operation> operations;
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Compte() {
		operations = new HashSet<Operation>();
	}

}
