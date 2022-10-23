package ex2;

public class mainRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(1,0,4);
		robot.afficheRobot();
		robot.tourneraDroit();
		robot.avancer();
	    System.out.printf("la position apres une tourne a droit et une avance");

		robot.afficheRobot();


	}

}
