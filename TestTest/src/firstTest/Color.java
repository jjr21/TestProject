package firstTest;

public class Color {
private String colorName;

public Color() {
	colorName = " ";
}
public Color(String r) {
	colorName = r;
}

public Color(Color object2) {
	colorName = object2.colorName;
}
public void setColor(String rr) {
	colorName = rr;
}

public String toString() {
	String str =  colorName;
	return str;
}
}
