package firstTest;

public class FindColor {

	public static void main(String[] args) {
		Color myColor = new Color("red");
		
		WhereIsColor myName = new WhereIsColor("Tree", myColor);
		System.out.println(myName);
		System.exit(0);
	}
}
