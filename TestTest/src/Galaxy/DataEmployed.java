package Galaxy;

import javax.swing.JOptionPane;

public class DataEmployed {

	public static void main(String[] args) {
		String input, ParseInput;
		int number;
		input = JOptionPane.showInputDialog("Name : ");
		ParseInput = JOptionPane.showInputDialog(" ID : ");
		number = Integer.parseInt(ParseInput);
		Employed data = new Employed(input, number);
		input = JOptionPane.showInputDialog("Enter year of member : ");
		number = Integer.parseInt(input);
		data.setYearMember(number);
		JOptionPane.showMessageDialog(null, "Name : " + data.getName() + " . ID : " + data.getEmployedID() + " . Member of year : " + data.getYearMember());
	}
}
