package sepa;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class PmtInf {
	@XmlElement(name = "PmtInfId")
	private String pmtinfid;
	
	@XmlElement(name = "PmtMtd")
	private String pmtmtd;
	
	@XmlElementWrapper(name= "Dbtr")
	@XmlElement(name = "Nm")
	private List <String> nm;
	
	@XmlElement(name = "DbtrAcct")
	private List <Dbtracct> dbtracct;
	
	@XmlElement(name= "DbtrAgt")
	private List <Fininstnid> fininstnid;
	
	@XmlElement(name="CdtTrfTxInf")
	private List <Cdttrftxinf> cdttrftxinf;

	public List<Cdttrftxinf> getCdttrftxinf() {
		return cdttrftxinf;
	}

	public void setCdttrftxinf(List<Cdttrftxinf> cdttrftxinf) {
		this.cdttrftxinf = cdttrftxinf;
	}

	public String getPmtinfid() {
		return pmtinfid;
	}

	public void setPmtinfid(String pmtinfid) {
		this.pmtinfid = pmtinfid;
	}

	public String getPmtmtd() {
		return pmtmtd;
	}

	public void setPmtmtd(String pmtmtd) {
		this.pmtmtd = pmtmtd;
	}

	public List<String> getNm() {
		return nm;
	}

	public void setNm(List<String> nm) {
		this.nm = nm;
	}

	public List<Dbtracct> getDbtracct() {
		return dbtracct;
	}

	public void setDbtracct(List<Dbtracct> dbtracct) {
		this.dbtracct = dbtracct;
	}
	
	public List<Fininstnid> getFininstnid() {
		return fininstnid;
	}

	public void setFininstnid(List<Fininstnid> fininstnid) {
		this.fininstnid = fininstnid;
	}

	@Override
	   public String toString() {
	      return "PmtInf="+ System.lineSeparator()+" PmtInfId=" + pmtinfid +  
	    		  System.lineSeparator()+"pmtmtd=" +pmtmtd+  
	    		  System.lineSeparator()+"dbtracct=" +nm+
	    		  System.lineSeparator() +dbtracct+
	    		  System.lineSeparator()+fininstnid+
	    		  System.lineSeparator()+cdttrftxinf;
	   }

}
