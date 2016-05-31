package sepa;



import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Amt {

	@XmlElement(name="InstdAmt")
	private List <Instdamt> instdamt;

	public List<Instdamt> getInstdamt() {
		return instdamt;
	}

	public void setInstdamt(List<Instdamt> instdamt) {
		this.instdamt = instdamt;
	}

	@Override
	   public String toString() {
	      return "Kolicina i valuta= "+instdamt;
	   }

}
