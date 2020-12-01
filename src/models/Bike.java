package models;

public class Bike extends Vehicle {
	
	// ATRIBUTES
	protected Wheel frontWheel;
	protected Wheel rearWheel;

	// CONSTRUCTOR
	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	// GETTERS & SETTERS
	public void set_plate(String plate) {
		this.plate = plate;
	}

	public void set_brand(String brand) {
		this.brand = brand;
	}

	public void set_color(String color) {
		this.color = color;
	}

	public Wheel getFrontWheel() {
		return frontWheel;
	}

	public void setFrontWheel(Wheel frontWheel) {
		this.frontWheel = frontWheel;
	}

	public Wheel getRearWheel() {
		return rearWheel;
	}

	public void setRearWheel(Wheel rearWheel) {
		this.rearWheel = rearWheel;
	}

	// TO STRING
	public String get_bikeData() { // getter
		return "Plate: " + plate + " | Brand: " + brand + "| Color: " + color;
	}

}
