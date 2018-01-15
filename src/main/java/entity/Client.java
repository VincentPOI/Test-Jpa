package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {
	@Id
	private int id;

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;

	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom;
	
	@OneToMany(mappedBy="idClient")
	private Set<Emprunt> emprunts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Client() {
		emprunts =new HashSet<Emprunt>();
	}
	public String toString() {
		String s = this.getId()+" -> "+this.getNom()+" "+this.getPrenom();
		return s;
	}

}
