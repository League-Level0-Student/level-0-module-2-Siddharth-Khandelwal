package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int Age = Integer.parseInt(age);
	if(Age>=18) {
		JOptionPane.showInputDialog("Who should be the next president?");
	}
	if(Age<18) {
		JOptionPane.showMessageDialog(null, "No one cares what you think);");
	}
}
}
