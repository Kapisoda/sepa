package sepa;


import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class demo {
	public static void main(String[] args) throws Exception {
		
	        JAXBContext jc = JAXBContext.newInstance(Document.class);

	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        Document prviDocument = (Document) unmarshaller.unmarshal(new File("C:\\test.xml"));
	        
	       //System.out.println(prviDocument);
	        
	        	Cstmrcdttrfinitn cst = prviDocument.getCstmrcdttrfinitn().get(0);
	  
	        	System.out.println("Group Header:");
	        	Grphdr groupHeader = cst.getGrphdry().get(0);
	        	System.out.println("Poruka: "+groupHeader.getMsgid());
	        	System.out.println("Datum: "+groupHeader.getCredttm());
	        	System.out.println("Broj naloga: "+groupHeader.getNboftxs());
	        	System.out.println("Ime Platitelja: "+groupHeader.getNm());
	        	System.out.println("========================================================");
	        	
	        	for(int i=0; i< cst.getPmtinf().size(); i++){
	        		PmtInf paymentInformation = cst.getPmtinf().get(i);
	        		System.out.println("Payment information:");
	        		System.out.println("Identifikacijska oznaka placanja : "+paymentInformation.getPmtinfid());
	        		System.out.println("Nacin placanja : "+paymentInformation.getPmtmtd());
	        		System.out.println("Naziv platitelja : "+paymentInformation.getNm());
	        		Dbtracct debtorAccount = paymentInformation.getDbtracct().get(0);
	        		System.out.println("IBAN : "+debtorAccount.getIban());
	        		
	        		for( int j=0; j< paymentInformation.getCdttrftxinf().size(); j++){
	        			System.out.println("----------------------Pocetak Naloga------------------------------------");
	        			
	        			Cdttrftxinf transactionInformation = paymentInformation.getCdttrftxinf().get(j);
	        			Pmtid paymentId = transactionInformation.getPmtid().get(0);
	        			System.out.println("Jedinstveni Identifikator : "+paymentId.getEndtoendid());
	        			Amt amount = transactionInformation.getAmt().get(0);
	        			Instdamt kolicinaValuta = amount.getInstdamt().get(0);
	        			System.out.println("Iznos: "+ kolicinaValuta.getKolicina()+" valuta: "+kolicinaValuta.getVrijednost());
	        			System.out.println("Ime Primatelja placanja: "+ transactionInformation.getName());
	        			CreditorAccount iban = transactionInformation.getCreditorAccount().get(0);
	        			System.out.println("IBAN PRIMATELJA: "+ iban.getIban());
	        			System.out.println("----------------------Kraj Naloga------------------------------------");
	        			
	        		}
	        		System.out.println("------------------------Kraj Payment information-------------------------------");
	        	}
	        	System.out.println("================================KRAJ XML-a===================================");
		}
}
