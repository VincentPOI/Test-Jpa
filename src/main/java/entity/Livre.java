package entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {
	@Id
	private int id;
	@Column(name = "TITRE", length = 255, nullable = false)
	private String titre;

	@Column(name = "AUTEUR", length = 50, nullable = false)
	private String auteur;
	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Livre() {
	}

	public String toString() {
		String s = "" + this.getId() + " -> " + this.getTitre() + " : " + this.getAuteur();
		return s;
	}
}
