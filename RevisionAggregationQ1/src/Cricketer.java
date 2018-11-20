
public class Cricketer {

	private String club;
	private int runs = 0;
	private Name name;
	
	public Cricketer(String f, String s, String c) {
		// TODO Auto-generated constructor stub
		name = new Name(f, s);
		club = c;
	}

	public String readFullName() {
		// TODO Auto-generated method stub
		return name.printFullName();
	}

	public String readClub() {
		// TODO Auto-generated method stub
		return club;
	}

	public int readRuns() {
		// TODO Auto-generated method stub
		return runs ;
	}

	public void addRuns(int r) {
		// TODO Auto-generated method stub
		runs +=r;
	}

	public void updateSurname(String s) {
		// TODO Auto-generated method stub
		name.updateSurname(s);
	}

	public void printDetails(String s) {
		// TODO Auto-generated method stub
		System.out.println(name.printFullName()+" Club: "+club+" Runs: "+runs);
	}

}
