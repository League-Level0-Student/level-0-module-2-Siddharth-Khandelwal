import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	Random ran=new Random();
	int randomNumber = ran.nextInt(5);
	JOptionPane.showMessageDialog(null, randomNumber );
	int hi = ran.nextInt(5);
	JOptionPane.showMessageDialog(null, hi );
	int hii = ran.nextInt(5);
	JOptionPane.showMessageDialog(null, hii );
	int hiii = ran.nextInt(5);
	JOptionPane.showMessageDialog(null, hiii );
	int hiiii = ran.nextInt(5);
	JOptionPane.showMessageDialog(null, hiiii );
	int hiiiii = ran.nextInt(5);
	JOptionPane.showMessageDialog(null, hiiiii);
}
}
