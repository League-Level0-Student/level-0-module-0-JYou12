import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	
	Robot bob = new Robot();
	bob.hide();
	bob.setSpeed(500);
	bob.penDown();
	bob.turn(90);
	bob.move(100);
	bob.turn(180);
	bob.move(50);
	bob.turn(-90);
	bob.move(50);
	for (int i=0; i<15; i++) {
	bob.turn(10);
	bob.move(3);
	}
	
}
}
