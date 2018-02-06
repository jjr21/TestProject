package firstTest;

public class ResultPlanet {

	public static void main(String[] args) {
		Venus venus11 = new Venus("Venus");
		Gravity num = new Gravity(8.90, venus11);
		System.out.println(num);
		System.exit(0);
	}
}
