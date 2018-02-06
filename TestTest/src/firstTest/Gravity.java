package firstTest;

public class Gravity {
	private double grav;
	private Venus venus;
	
	/**
	 * 
	 * @param g
	 * @param v
	 */
	public Gravity(double g, Venus v) {
		grav = g;
		venus = new Venus(v);
	}

	public double getGravity() {
		return grav;
	}
	/**
	 * 
	 * @return
	 */
		public Venus getVenus() {
			return new Venus(venus);
		}
	/**
	 * @return
	 */
	public String toString() {
		String input = "Planet : " + venus + " Gravity " + grav;
		return input;
	}
}

