package firstTest;

public class HelloMars {
	private static Venus Saturn;
	private static Venus pluto;
	public static void main(String[] args) {
		Venus planetVenus = new Venus();
		Venus planet;
		planet = getNeptune();
		Saturn = getSaturn();
		Saturn.setComment("Hello Saturn");
		pluto = getPluto();
		String v = "Hello Venus";
		planetVenus.setComment(v);
		Mars();
		System.out.println(planetVenus.getComment());
		System.out.println(planet.toString());
		System.out.println(Saturn.toString());
		System.out.println(pluto.toString());
		System.exit(0);
	}
	public static void Mars() {
		System.out.println("Hello Mars");
	}
	public static Venus getNeptune() {
		String input;
		input = "Hello Neptune";
		return new Venus(input);
	}
	public static Venus getPluto() {
		String input;
		input ="Hello Pluto";
		return new Venus(input);
	}
	public static Venus getSaturn() {
		return new Venus();
	}
}
