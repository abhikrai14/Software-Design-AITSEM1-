
class Account{
	public int balance=0;
      public Account(int b)
      {
    	  balance = b;
      }
      
	public void deposit(int amt)
	{
		this.balance += amt;
	}
	
	public void withdraw(int amt) throws InsuffFunds, AmtExceeds100
	{
		int resultCode=0;
		if (amt>100) 
		{ 
			//resultCode=1; 
			throw new AmtExceeds100();
		}
		else if (amt> balance)
		{ 
			//resultCode=2;  
			throw new InsuffFunds();
		}
		     else 
	         { 
		    	 balance -= amt;
		     }
		//return resultCode;
	}
	
	public int read_balance()
	{
		return this.balance;
	}
}

public class TestAccount2{
public static void main(String [] args){
        Account a = new Account(150);
        int amt[]={70, 120,85};
        for(int i=0;i<3;i++){
           //int resultCode = 
        	try {
        		a.withdraw(amt[i]);
        		System.out.println("Success");
        	}
        	catch(AmtExceeds100 e){
        		System.out.println("Max withdrawl100"); 
        	}
        	catch(InsuffFunds e){
        		System.out.println("Insuff Funds");
        	}
        }
	}}

