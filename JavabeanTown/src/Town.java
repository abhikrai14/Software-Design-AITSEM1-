import java.io.Serializable;

public class Town implements Serializable {
	private String name;
	private int population=0;

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getPopulation() {
		// TODO Auto-generated method stub
		return population;
	}

	public void setName(String first) {
		// TODO Auto-generated method stub
		name = first;
	}

	public void setPopulation(int pop) {
		// TODO Auto-generated method stub
		population = pop;
	}

}
