package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String answer;
		
		// 1. Ask the user if they know how to write code.
		answer=JOptionPane.showInputDialog("Do you speak code?");
		if(answer.equals("yes"))
		// 2. If they say "yes", tell them they will rule the world.
		{JOptionPane.showInputDialog("You will rule the world");}
		// 3. Otherwise, wish them good luck washing dishes.
		else
		{JOptionPane.showInputDialog("Good luck washing dishes");}
			
		}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
