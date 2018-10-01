package question3;

public class Account {

private String name;
private int number;
private int transactions;
private Money balance;

public Account(String n, int no) { 
	
	name = n;
	number = no;
	balance = new Money(0, 0);
}

public String read_bal() {
	return balance.read_value();
}

public String read_name() {
	return name;
}

public int read_transactions() {
	return transactions;
}

public void deposit(int e, int c) {
	balance.add(e, c);
	transactions++;
}

public boolean withdraw(int e, int c) {
	if (balance.sub(e, c))
	{
		transactions++;
		return true;
	}
	return false;
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
