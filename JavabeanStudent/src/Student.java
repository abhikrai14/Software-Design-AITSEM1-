import java.io.Serializable;

public class Student implements Serializable {
	private String firstname;
	private String lastname;
	private int Age=0; 
	public Student() {
		firstname = "Abhik";
		lastname = "Rai";
		Age=0;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstname;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return lastname;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return Age;
	}

	public void setFirstName(String s1) {
		firstname = s1;
		// TODO Auto-generated method stub
		
	}

	public void setLastName(String last) {
		lastname = last;
		// TODO Auto-generated method stub
		
	}

	public void setAge(int age) {
		Age = age;
		// TODO Auto-generated method stub
		
	}

}
