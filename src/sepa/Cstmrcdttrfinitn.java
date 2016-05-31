package sepa;

import java.util.List;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)

public class Cstmrcdttrfinitn {
	
	@XmlElement(name = "GrpHdr")
	private List <Grphdr> grphdry;
	
	@XmlElement(name = "PmtInf")
	private List <PmtInf> pmtinf;

	public List<Grphdr> getGrphdry() {
		return grphdry;
	}

	public void setGrphdry(List<Grphdr> grphdry) {
		this.grphdry = grphdry;
	}

	public List<PmtInf> getPmtinf() {
		return pmtinf;
	}

	public void setPmtinf(List<PmtInf> pmtinf) {
		this.pmtinf = pmtinf;
	}
	
	@Override
	   public String toString() {
	      return "" + grphdry +  System.lineSeparator()+  System.lineSeparator() + pmtinf +"";
	   }

}
