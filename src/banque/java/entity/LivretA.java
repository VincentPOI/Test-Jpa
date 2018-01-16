package entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LIVRET_A")
public class LivretA extends Compte {
	
	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public LivretA() {
		// TODO Auto-generated constructor stub
	}

}
