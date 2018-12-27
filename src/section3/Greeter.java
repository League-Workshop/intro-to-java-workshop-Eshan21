package section3;

import javax.swing.JOptionPane;

public class Greeter {
	
	public static void main(String[] args) {
		
		String name=JOptionPane.showInputDialog("Plz type ur N@M3...");
		JOptionPane.showMessageDialog(null,	"Hi, " + name);
		
		
	}
	
}
