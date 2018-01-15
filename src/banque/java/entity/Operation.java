package entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OPERATION")
public class Operation {
	
	@Id
	private int id;
	
	@Column(name = "DATE")
	private LocalDate date;
	@Column(name = "MONTANT")
	private double montant;
	@Column(name = "MOTIF")
	private String motif;
	
	@ManyToOne
	@JoinColumn(name="ID_COMPTE")
	private Compte compte;
	
	
	
	
	public Operation() {
		// TODO Auto-generated constructor stub
	}

}
