package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
public static void main(String[] args) {
		String words;
	words= JOptionPane.showInputDialog("Say your name.");
		speak(words);
	
		String words2;
	words2= JOptionPane.showInputDialog("How old are you?");
		speak(words2);
	
		String words3;
	words3= JOptionPane.showInputDialog("What is your favorite color?");
		speak(words3);
		
	// 2. ask the user for a sentence
	// 3. call the speak method below and send it the sentence

	

	// 4. repeat steps 2 and 3 a lot of times
}
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
