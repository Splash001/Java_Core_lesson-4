package ua.lviv.lgs.task1;

public class Robot {
	private String name;
	private String action;

	public Robot(String name, String action) {
		this.name = name;
		this.action = action;
	}

	public void work() {
		System.out.println("ß " + name + " – ÿ " + action);
	}
}
