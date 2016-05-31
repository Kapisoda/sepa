package sepa;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Cdttrftxinf {
	
	@XmlElement(name= "PmtId")
	private List <Pmtid> pmtid;
	
	
	@XmlElement(name="Amt")
	private List <Amt> amt;
	
	@XmlElementWrapper(name="Cdtr")
	@XmlElement(name="Nm")
	private List <String> name;
	
	
	@XmlElement(name="CdtrAcct")
	private List <CreditorAccount> creditorAccount;
	
	


	public List<CreditorAccount> getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(List<CreditorAccount> creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public List<Amt> getAmt() {
		return amt;
	}

	public void setAmt(List<Amt> amt) {
		this.amt = amt;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public List<Pmtid> getPmtid() {
		return pmtid;
	}

	public void setPmtid(List<Pmtid> pmtid) {
		this.pmtid = pmtid;
	}
	
	@Override
	   public String toString() {
	      return "Cdttrftxinf="+pmtid+System.lineSeparator()+
	    		  "  Amount="+amt+System.lineSeparator()+
	    		  " name="+name +System.lineSeparator()+
	    		  "creditorAccount="+ creditorAccount;
	   }

}
