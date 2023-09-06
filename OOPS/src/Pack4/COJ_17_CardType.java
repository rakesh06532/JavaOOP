package Pack4;

public class COJ_17_CardType {
	private COJ_17_Customer c;
	private String cardType;
	public COJ_17_CardType(COJ_17_Customer c, String cardType) {
		super();
		this.c = c;
		this.cardType = cardType;
	}
	public String toString() {
		return "COJ_17_CardType [ " + c + ", cardType=" + cardType + "]";
	}

}
