package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String code=JOptionPane.showInputDialog("DO U NO DA C0D3?");
		// 2. If they say "yes", tell them they will rule the world.
		if (code.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the WORLD!... maybe", "WORLD DOMINATION... maybe", JOptionPane.NO_OPTION);
		}else {
		// 3. Otherwise, wish them good luck washing dishes.
			JOptionPane.showMessageDialog(null, "G00D LUC W@$H!nG D!$H3$... MUAHAHAHAHA");
		}
	}
}

