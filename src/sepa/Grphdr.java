package sepa;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Grphdr {
	
	@XmlElement(name = "MsgId")
	private String msgid;
	
	@XmlElement(name = "CreDtTm")
	private String credttm;
	
	@XmlElement(name ="NbOfTxs")
	private String nboftxs;
	
	@XmlElementWrapper(name = "InitgPty")
	@XmlElement(name ="Nm")
	 private List<String> nm;
	
	
	


	public List<String> getNm() {
		return nm;
	}

	public void setNm(List<String> nm) {
		this.nm = nm;
	}

	public String getNboftxs() {
		return nboftxs;
	}

	public void setNboftxs(String nboftxs) {
		this.nboftxs = nboftxs;
	}

	public String getMsgid() {
		return msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getCredttm() {
		return credttm;
	}

	public void setCredttm(String credttm) {
		this.credttm = credttm;
	}
	
	@Override
	   public String toString() {
	      return "Grphdr ="+ System.lineSeparator() +" msgid=" + msgid + System.lineSeparator() 
	      +" credttm ="+ credttm +System.lineSeparator() +" nboftxs="+nboftxs+
	      System.lineSeparator()+" nm=" + nm + "";
	   }
	

}
