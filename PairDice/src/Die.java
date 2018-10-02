public class Die {
private int value;
public Die(int v1) {value=v1;}
public void roll() 
{
	double res = Math.random();
	value=1+(int)(res*100)%6;
}

public int getValue() {return value;}
}

