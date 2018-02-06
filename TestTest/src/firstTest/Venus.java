package firstTest;

public class Venus {
	
	private String comment;

	public Venus() {
		comment = " ";
				
		
	}

	public Venus(String n) {
		comment = n;
	}
	public Venus(Venus object2) {
		comment = object2.comment;
	}
	
	
	public void setComment(String s) {
		comment = s;
		
	}
	public String getComment() {
		return comment;
	}
	
	public String toString() {
		String str = comment;
		return str;
	}
	
}
