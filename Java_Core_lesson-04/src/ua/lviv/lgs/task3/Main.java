package ua.lviv.lgs.task3;

public class Main {
	
	public static void main(String[] args) {
		
		Тварина animal = new Тварина("Леопард", 20, 7);
		System.out.println(animal);
		System.out.println("----------------------------");
		animal.setName("Бик");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println(animal);
	}
}
