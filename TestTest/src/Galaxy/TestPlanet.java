package Galaxy;

public class TestPlanet {

	public static void main(String[] args) {
		
		Moon name = new Moon("Titan");
		name.setPlanet("Juptier");
		name.setCar("Tesla");
		String input = "Planet : " + name.getPlanet() + " Moon : " + name.toString();
		System.out.println(input);
		System.exit(0);
	} 
}
