package Galaxy;

public class Planet {

	private String planetName;
	
	public Planet() {
		planetName = " ";
	}
	public Planet(String p) {
		planetName = p;
	}
	public void setPlanet(String th) {
		planetName = th;
	}
	public Planet(Planet object) {
		planetName = object.planetName;
	}
	public String getPlanet() {
		return planetName;
	}
	public String toString() {
		String str = planetName;
		return str;
	}
}
