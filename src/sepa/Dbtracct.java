package sepa;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Dbtracct {

	@XmlElementWrapper(name="Id")
	@XmlElement(name="IBAN")
	private List <String> iban;

	
	
	public List<String> getIban() {
		return iban;
	}



	public void setIban(List<String> iban) {
		this.iban = iban;
	}



	@Override
	   public String toString() {
	      return "iban="+ iban;
	   }
	
	
}
