package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot sarina=new Robot("mini");

	void go() {

		// 4. Make the robot move as fast as possible
sarina.setSpeed(8);
		// 5. Set the pen width to 5
sarina.setPenWidth(5);
sarina.penDown();
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	sarina.setRandomPenColor();
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
sarina.turn(90);



	}}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
sarina.move(50);
sarina.turn(90);
sarina.move(50);
sarina.turn(90);
sarina.move(50);
sarina.turn(90);
sarina.move(50);
sarina.turn(90);


	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
