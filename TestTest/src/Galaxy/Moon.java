package Galaxy;

public class Moon extends Planet{
	private String moonName;
	
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
	
	public String getMoon() {
		return moonName;
	}
	public String toString() {
		String str = moonName + toString();
		return str;
	}
}
