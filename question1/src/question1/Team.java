package question1;

public class Team {
private Counter games_played;
private Counter points;
private String team_name;

public Team(String n, int gp, int pt) {
	team_name = n;
	games_played = new Counter(gp);
	points = new Counter(pt);
}

public void win()
{
	games_played.increment();
	points.increment(); points.increment(); points.increment();
}

public void draw() {
	games_played.increment();
	points.increment();
}

public void loss() {
	games_played.increment();
}

public void print_details() {
	System.out.println("Done");
}

public String readName() {
	return team_name;
}

public int readPlayed() {
	return games_played.read_value();
}

public int readPoints() {
	return points.read_value();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
