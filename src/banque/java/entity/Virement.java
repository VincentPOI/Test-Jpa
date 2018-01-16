package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("V")
@Table(name="VIREMENT")
public class Virement extends Operation {

	private String beneficiaire;

	
	
	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	public Virement() {
		// TODO Auto-generated constructor stub
	}

}
