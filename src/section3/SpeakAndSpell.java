package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
		String answer = JOptionPane.showInputDialog("ANSWER: ");
		// 3. If the user spelled the word correctly, speak "correct"
		if (answer.equalsIgnoreCase("mandlebrot")) {
			JOptionPane.showMessageDialog(null, "You WON!!!");
		}else {
		// 4. Otherwise say "wrong"
		JOptionPane.showMessageDialog(null, "You ARE WRONG!!!");
		speak("You are a disgrace to you family if you can't even spell such a simple word! Get out! We don't need or want TRASH like you! A elementary school drop out could spell better than you! WAHHAHAHA!");
		JOptionPane.showMessageDialog(null, "DIE!");
		// 5. repeat the process for other words
		}
		speak("spell joshua");
		// 2. Catch the user's answer in a String
		String answer1 = JOptionPane.showInputDialog("ANSWER: ");
		// 3. If the user spelled the word correctly, speak "correct"
		if (answer1.equalsIgnoreCase("joshua")) {
			JOptionPane.showMessageDialog(null, "You WON!!!");
		}else {
		// 4. Otherwise say "wrong"
		JOptionPane.showMessageDialog(null, "You ARE WRONG!!!");
		speak("You are a disgrace to you family if you can't even spell such a simple word! Get out! We don't need or want TRASH like you! A elementary school drop out could spell better than you! WAHHAHAHA!");
		JOptionPane.showMessageDialog(null, "DIE!");
		// 5. repeat the process for other words
		}
		speak("spell jeff");
		// 2. Catch the user's answer in a String
		String answer11 = JOptionPane.showInputDialog("ANSWER: ");
		// 3. If the user spelled the word correctly, speak "correct"
		if (answer11.equalsIgnoreCase("jeff")) {
			JOptionPane.showMessageDialog(null, "You WON!!!");
		}else {
		// 4. Otherwise say "wrong"
		JOptionPane.showMessageDialog(null, "You ARE WRONG!!!");
		speak("You are a disgrace to you family if you can't even spell such a simple word! Get out! We don't need or want TRASH like you! A elementary school drop out could spell better than you! WAHHAHAHA!");
		JOptionPane.showMessageDialog(null, "DIE!");
		// 5. repeat the process for other words
		}
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


