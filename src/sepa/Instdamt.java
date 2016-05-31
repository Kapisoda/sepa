package sepa;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Instdamt {

	@XmlAttribute(name="Ccy")
	private String valuta;
	
	@XmlValue
	private double kolicina;

	
	
	public String getVrijednost() {
		return valuta;
	}



	public void setVrijednost(String vrijednost) {
		this.valuta = vrijednost;
	}



	public double getKolicina() {
		return kolicina;
	}



	public void setKolicina(double kolicina) {
		this.kolicina = kolicina;
	}



	@Override
	   public String toString() {
	      return "Kolicina "+kolicina+" valuta= "+valuta;
	   }
	
}
