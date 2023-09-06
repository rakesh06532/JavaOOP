package Pack4;

public class COJ_17_CardsOnOffer {
	public static COJ_17_CardType getOfferedCard( COJ_17_Customer Name ) {
		String type="";
		if(Name.getCreditPoint()>=100&&Name.getCreditPoint()<=500)
		{
			type="silver";
		}
		if(Name.getCreditPoint()>=501&&Name.getCreditPoint()<=1000)
		{
			type="Gold";
		}
		if(Name.getCreditPoint()>1000)
		{
			type="Platinum";
		}
		if(Name.getCreditPoint()<100)
		{
			type="EMI";
		}
		 COJ_17_CardType cc=new COJ_17_CardType(Name,type);
		return cc;
			
		
	}

}
