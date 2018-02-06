package Galaxy;

public class TestPlanet {

	public static void main(String[] args) {
		
		Moon name = new Moon("Titan");
		name.setPlanet("Juptier");
		String input = "Planet : " + name.getPlanet() + " Moon : " + name.getMoon();
		System.out.println(input);
		System.exit(0);
	}
}
