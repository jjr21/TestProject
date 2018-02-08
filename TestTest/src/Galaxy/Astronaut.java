package Galaxy;

public abstract class Astronaut {

	private String name;
	private int employedID;

	
	public Astronaut(String name1, int id1) {
		name = name1;
		employedID = id1;
	}
	public void setName(String n) {
		name = n;
	}
	public void setEmployedID(int i) {
		employedID = i;
	}
	public String getName() {
		return name;
	}
	
	public int getEmployedID() {
		return employedID;
	}
	public abstract void setYearMember(int y);
	public abstract int getYearMember();
}
