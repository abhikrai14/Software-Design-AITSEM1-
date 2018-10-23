
public class MyException extends Exception {
public MyException() {
	super();
}
}

class InsuffFunds extends Exception{
	public InsuffFunds() {
		super();
	}
}

class AmtExceeds100 extends Exception{
	public AmtExceeds100() {
		super();
	}
}