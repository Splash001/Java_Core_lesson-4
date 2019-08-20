package ua.lviv.lgs.task2;

public class SteeringWheel {

	private int diametr;
	private String color;
	private String material;

	public SteeringWheel(int diametr, String color, String material) {
		this.diametr = diametr;
		this.color = color;
		this.material = material;
	}

	private int diametr() {
		return diametr;
	}

	private void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	private String getMaterial() {
		return material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [diametr=" + diametr + ", color=" + color + ", material=" + material + "]";
	}

	public int increaseSteeringWheel() {
		return diametr = diametr + 3;
	}

}
