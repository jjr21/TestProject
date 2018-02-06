package firstTest;

public class WhereIsColor {

	private Color color;
	private String name;
	
	public WhereIsColor(String n, Color c) {
		name = n;
		color = new Color(c);
	}
	public String getName() {
		return name;
	}
	public Color getColor() {
		return new Color(color);
	}
	public String toString() {
		String str = "Name : " + name + " Color : " + color;
		return str;
	}
}
