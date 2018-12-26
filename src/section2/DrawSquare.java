package section2;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {

	public static void main(String[] args) {
		
		Robot jeff = new Robot();
		jeff.penDown();
		jeff.setSpeed(500);
		int size = 200;
		for (int i=0; i<4; i++) {
			jeff.move(size);
			jeff.turn(90);		
		}
	}
	
}
