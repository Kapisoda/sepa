package sepa;



import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "Document")

public class Document {
	
	@XmlElement(name ="CstmrCdtTrfInitn")
	private List <Cstmrcdttrfinitn> cstmrcdttrfinitn;

	public List<Cstmrcdttrfinitn> getCstmrcdttrfinitn() {
		return cstmrcdttrfinitn;
	}

	public void setCstmrcdttrfinitn(List<Cstmrcdttrfinitn> cstmrcdttrfinitn) {
		this.cstmrcdttrfinitn = cstmrcdttrfinitn;
	}

	@Override
	   public String toString() {
	      return "" + cstmrcdttrfinitn + "";
	   }
	
	/*@XmlElementWrapper(name="CstmrCdtTrfInitn")
	@XmlElement(name="GrpHdr") 
	List<Grphdr> grphdry;

	@XmlElement(name= "PmtInf")
	List <PmtInf> pmtinf;

	public List<PmtInf> getPmtinf() {
		return pmtinf;
	}

	public void setPmtinf(List<PmtInf> pmtinf) {
		this.pmtinf = pmtinf;
	}

	public List<Grphdr> getGrphdry() {
		return grphdry;
	}

	public void setGrphdry(List<Grphdr> grphdry) {
		this.grphdry = grphdry;
	}
	*/

}
