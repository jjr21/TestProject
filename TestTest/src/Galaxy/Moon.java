package Galaxy;

public class Moon extends Planet implements Tesla{
	private String moonName;
	private String carName;
	
	public Moon() {
		moonName = " ";
	}
	public Moon(String p) {
		moonName = p;
	}
	public void setMoon(String mn) {
		moonName = mn;
	}
	public Moon(Moon object3) {
		moonName = object3.moonName;
	}
	public void setCar(String s) {
		carName = s;
	}
	public String getCar() {
		return carName;
	}
	public String getMoon() {
		return moonName;
	}
	public String toString() {
		String str = moonName + " " + " car : " + getCar();
		return str;
	}
}
