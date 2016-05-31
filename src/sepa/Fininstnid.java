package sepa;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Fininstnid {

	@XmlElement(name="BIC")
	private List <String> bic;

	public List<String> getBic() {
		return bic;
	}

	public void setBic(List<String> bic) {
		this.bic = bic;
	}
	
	@Override
	   public String toString() {
	      return "BIC="+bic;
	}
	
}
