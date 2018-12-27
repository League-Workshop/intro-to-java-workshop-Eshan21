package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String q1Answer=JOptionPane.showInputDialog("D0 U N0 DA WAE?");
		// 3.  Use an if statement to check if their answer is correct
		if (q1Answer.equalsIgnoreCase("yee")) {
			
		// 4.  if the user's answer is correct
		score+=1;
		speak("You gained a point!");
		// -- add one to their score 
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String q1Answer1=JOptionPane.showInputDialog("D0 U N0 DA WAE?");
		// 3.  Use an if statement to check if their answer is correct
		if (q1Answer1.equalsIgnoreCase("no")) {
			
		// 4.  if the user's answer is correct
		score+=1;
		speak("You gained a point!");
		// -- add one to their score 
		}
		String q1Answer11=JOptionPane.showInputDialog("D0 U N0 DA WAE?");
		// 3.  Use an if statement to check if their answer is correct
		if (q1Answer11.equalsIgnoreCase("yee")) {
			
		// 4.  if the user's answer is correct
		score+=1;
		speak("You gained a point!");
		// -- add one to their score 
		}
		String q1Answer111=JOptionPane.showInputDialog("D0 U N0 DA WAE?");
		// 3.  Use an if statement to check if their answer is correct
		if (q1Answer111.equalsIgnoreCase("yee")) {
			
		// 4.  if the user's answer is correct
		score+=1;
		speak("You gained a point!");
		// -- add one to their score 
		}
		String q1Answer1111=JOptionPane.showInputDialog("D0 U N0 DA WAE?");
		// 3.  Use an if statement to check if their answer is correct
		if (q1Answer1111.equalsIgnoreCase("no")) {
			
		// 4.  if the user's answer is correct
		score+=1;
		speak("You gained a point!");
		// -- add one to their score 
		}
		String q1Answer11111=JOptionPane.showInputDialog("D0 U N0 DA WAE?");
		// 3.  Use an if statement to check if their answer is correct
		if (q1Answer11111.equalsIgnoreCase("yee")) {
			
		// 4.  if the user's answer is correct
		score+=1;
		speak("You gained a point!");
		// -- add one to their score 
		}
		// 6.  After all the questions have been asked, print the user's score 
		
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
