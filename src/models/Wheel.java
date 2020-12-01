package models;

public class Wheel {

	// ATRIBUTES
	private String brand;
	private double diameter;

	// CONSTRUCTOR
	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	// GETTERS & SETTERS
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Wheel [brand=" + brand + ", diameter=" + diameter + "]";
	}
	

}
