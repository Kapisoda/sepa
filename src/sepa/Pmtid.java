package sepa;


import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Pmtid {
	
	@XmlElement(name = "InstrId")
	private List <String> instrid;

	@XmlElement(name = "EndToEndId")
	private List <String> endtoendid;

	public List<String> getInstrid() {
		return instrid;
	}

	public void setInstrid(List<String> instrid) {
		this.instrid = instrid;
	}

	public List<String> getEndtoendid() {
		return endtoendid;
	}

	public void setEndtoendid(List<String> endtoendid) {
		this.endtoendid = endtoendid;
	}
	
	@Override
	 public String toString() {
	      return "Pmtid=    InstrId"+instrid+System.lineSeparator()+
	    		  "EndToEndId="+endtoendid;
	   }
}
