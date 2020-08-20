import javax.swing.JOptionPane;

public class CodingChallenge2 {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int hello = Integer.parseInt(age);
	for (int i = 0; i <hello; i++) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	
	JOptionPane.showMessageDialog(null, "I owe you " +age+ " wishes!");
}
}
