package ua.lviv.lgs.task2;

public class Wheel {

	private int size;
	private String name;
	private String typeTyre;

	public Wheel(int size, String name, String typeTyre) {
		this.size = size;
		this.name = name;
		this.typeTyre = typeTyre;
	}

	private int getDiametr() {
		return size;
	}

	private void setDiametr(int diametr) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Wheel [size= R" + size + ", name=" + name + ", typeTyre=" + typeTyre + "]";
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getTypeTyre() {
		return typeTyre;
	}

	private void setTypeTyre(String typeTyre) {
		this.typeTyre = typeTyre;
	}

	public int increaseDiametr() {
		return size = size * 3;
	}

}
