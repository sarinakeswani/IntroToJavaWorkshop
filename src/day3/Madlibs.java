package day3;

	import javax.swing.JOptionPane;

	public class Madlibs {
		public static void main(String[] args) {
			String adjective;
			String typeofliquid;
			String bodypart;
			String verb;
			String place;
			// Put this sentence in a pop up:
			// If you find yourself having to cross a piranha-infested river, here's how to do it...
			JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
			// Get the user to enter an adjective
			adjective=JOptionPane.showInputDialog("Enter an adjetive");
			// Get the user to enter a type of liquid
			typeofliquid=JOptionPane.showInputDialog("Enter a type of liquid");
			// Get the user to enter a body part
			bodypart=JOptionPane.showInputDialog("Enter a body part");
			// Get the user to enter a verb
			verb=JOptionPane.showInputDialog("Enter a verb");
			// Get the user to enter a place
			place=JOptionPane.showInputDialog("Enter a place");
			// Fit the user's words into this sentence, and save it in a String:
			JOptionPane.showMessageDialog(null, "Piranhas are more "+adjective+" during the day, so cross the river at night. Piranhas are attracted to fresh "+typeofliquid+" and will most likely take a bite out of your "+bodypart+" if you "+verb+". Whatever you do, if you have an open wound, try to find another way to get back to the "+place+". Good luck!");			
			// Make a pop-up for the final story. You can use \n to go to the next line.
			

		}
	}



