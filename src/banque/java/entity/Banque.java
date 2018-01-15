package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BANQUE")
public class Banque {

	@Id
	private int id;
	@Column(name = "NOM")
	private String nom;
	@OneToMany(mappedBy = "banque")
	private Set<Clientb> clients;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Banque() {
		clients = new HashSet<Clientb>();
	}

}
