import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class codingChallenge {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
	int hi	=	Integer.parseInt(age);
		for (int i = 0; i <hi; i++) {
				JOptionPane.showMessageDialog(null,"Happy Birthday ͡° ͜ʖ ͡°");
		}
	JOptionPane.showMessageDialog(null, "Happy Birthday, i owe you " +age+ " wishes!");	
	}
	
	
	
}
