package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		jop.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adjective = jop.showInputDialog("Enter a arid adjective...");
		// Get the user to enter a type of liquid
		String liquid = jop.showInputDialog("Enter a limey liquid...");
		// Get the user to enter a body part
		String bodyPart = jop.showInputDialog("Enter a big body part...");
		// Get the user to enter a verb
		String verb = jop.showInputDialog("Enter a virtuous verb...");
		// Get the user to enter a place
		String place = jop.showInputDialog("Enter a perfect place...");
		// Fit the user's words into this sentence, and save it in a String:
		jop.showMessageDialog(null, "Piranhas are more "+adjective+" during the day, so cross the river at night. Piranhas are attracted to fresh "+liquid+" and will most likely take a bite out of your "+bodyPart+" if you "+verb+". Whatever you do, if you have an open wound, try to find another way to get back to the " + place +". Good luck!"); 
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

