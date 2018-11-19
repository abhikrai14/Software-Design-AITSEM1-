
public class Name {
	
	
	 String lastname;
	 String firstname;

	public Name(String n, String l) {
		// TODO Auto-generated constructor stub
		firstname = n;
		lastname = l;
	}

	public String readSurname() {
		// TODO Auto-generated method stub
		return lastname;
	}

	public String readFirst() {
		// TODO Auto-generated method stub
		return firstname;
	}

	public void updateFirst(String s) {
		// TODO Auto-generated method stub
		this.firstname = s;
	}

	public void updateSurname(String s) {
		// TODO Auto-generated method stub
		this.lastname = s;
	}

	public void printFullName() {
		// TODO Auto-generated method stub
		System.out.println("Name = "+firstname + lastname);
	}

	public void updateFullName(String s1) {
		// TODO Auto-generated method stub
		s1.trim();
		
		int index = s1.indexOf(' ');
		firstname = s1.substring(0, index);
		lastname = s1.substring(index+1);
		
		updateFirst(firstname);
		updateSurname(lastname);
	}



}
