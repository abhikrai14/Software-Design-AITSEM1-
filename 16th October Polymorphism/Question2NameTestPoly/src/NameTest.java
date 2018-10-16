class Name
    {
        protected String value;
        public Name(String v) {
			value=v;
		}
		public void print() {
        	System.out.println(value);
        }
		public void resetName(String v) {value=v;}
    }
public class NameTest {

	public static void main(String[] args) {
        	Name[] list=new Name[4];
        	list[0]= new Name("Athy");
        	list[1]= new Underline("Bally");
        	list[2]= new Uppercase("Cork");
        	list[3]= new Underline("Derry");
        
		for(int i=0;i<list.length;i++){
			list[i].print();
			System.out.println();
		}  
	}
}
