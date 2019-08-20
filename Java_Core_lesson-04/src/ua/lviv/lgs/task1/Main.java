package ua.lviv.lgs.task1;

public class Main {

	public static void main(String[] args) {

		Robot robot = new Robot("Robot", "просто працюю");
		robot.work();
		CoffeRobot coffeRobot = new CoffeRobot("CoffeRobot", "варю каву");
		coffeRobot.work();
		RobotDancer robotDancer = new RobotDancer("RobotDancer", "просто танцюю");
		robotDancer.work();
		RobotCoocker robotCoocker = new RobotCoocker("RobotCoocker", "просто готую");
		robotCoocker.work();

		System.out.println("");
		System.out.println("-----------------Розділ------------------------");
		System.out.println("");

		Robot[] robots = new Robot[4];

		robots[0] = new Robot("Robot", "Арнольд Шварцнеггер");
		robots[1] = new CoffeRobot("CoffeRobot", "Какао мейкер");
		robots[2] = new RobotDancer("RobotDancer", "Філіп Оглобля");
		robots[3] = new RobotCoocker("RobotCoocker", "Іван Ургант");

		for (int i = 0; i <= 3; i++) {
			robots[i].work();
		}
	}

}
