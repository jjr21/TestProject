package Galaxy;

public class Employed extends Astronaut{
	private int year;
	
	public Employed(String s, int i) {
		super(s, i);
	}
	public  void setYearMember(int y) {
		year = y;
	}
	public int getYearMember() {
		return year;
	}

}
