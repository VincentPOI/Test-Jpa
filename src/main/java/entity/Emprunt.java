package entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {
	@Id
	private int id;
	@Column(name = "DATE_DEBUT", nullable = false)
	private LocalDate dateDebut;
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	@Column(name = "DELAI")
	private int delai;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT", nullable = false)
	private int idClient;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public int getDelai() {
		return delai;
	}
	public void setDelai(int delai) {
		this.delai = delai;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public Emprunt() {
	}
	public String ToString(){
		String s = this.getId()+" -> "+" début : "+this.getDateDebut()+ " , fin : "+this.getDateFin();
		return s;
	}

}
