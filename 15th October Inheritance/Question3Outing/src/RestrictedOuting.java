
public class RestrictedOuting extends Outing {
	
	int max;

	public RestrictedOuting(int count, int m) {
		super(count);
		max=m;
		// TODO Auto-generated constructor stub
	}
	
	public boolean add() {
		if(count<max) {
			count+=1;
			return true;
		}
		return false;
	}
	
	public int readCount() {
		return count;
		
	}
	
	public void print_details() {
		super.print_details();
		
	}
}
