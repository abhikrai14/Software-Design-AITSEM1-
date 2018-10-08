
public class MaxTest {

	static int max=0;
    public static int max(int value){
    	if(value<10)
    	{
    		if(value>max) {
    			max=value;
    		}
    		return max;
    	}
    	else {
    		
    	int rest = value/10;
    	int last = value%10;
    	
    	if(last>max)
    	{
    		max=last;
    	}
    	return max(rest);
    	}
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ max(number));
    }
}

