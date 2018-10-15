
public class DiscountTicket extends Ticket{
	
	private int disc;

	public DiscountTicket(int p, String s, String e, int d) {
		super(p, s, e);
		disc = d;
		// TODO Auto-generated constructor stub
	}
	
	public void setDiscount(int d)
	{
		this.disc = d;
	}
	
	public int grossPrice()
	{
		price = price-disc;
		return price;
		
	}

}
