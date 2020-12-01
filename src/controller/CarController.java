package controller;

import models.Car;
import models.Wheel;
import view.InputScanner;

public class CarController {
	
	public static void crateCar() {
		System.out.println("\nCreating a CAR: ");
		System.out.println("\nEnter The Brand: ");
		String brand = InputScanner.inPut();
		System.out.println("\nEnter The Color: ");
		String color = InputScanner.inPut();
		Car car = new Car(createPlate(), brand, color);
		System.out.println("\nThe Vehicle was created Successfully");
		System.out.println("\n Plate:"+car.getPlate()+" , Brand: "+car.getBrand()+" , Color: "+car.getColor());
		System.out.println("\nNow lets introduce the accesories...");
		car.setFrontWheels(createFrontWheels());
		car.setRearWheels(createRearWheels());
		System.out.println("Front wheels:"+car.getFrontWheels().toString());
		System.out.println("Rear wheels:"+car.getRearWheels().toString());
		
	}
	
	public static String createPlate() {
		String plate;
		do {
			System.out.println("\nEnter the plate: ");
			plate = InputScanner.inPut();
		}while(!plateValidation(plate));
		return plate;		
	}
	
	public static boolean plateValidation(String plate) {
		int contNum = 0;
		int contChar = 0;

		for (int i = 0; i < (plate.length()); i++) {
			if (Character.isDigit(plate.charAt(i))) {
				contNum++;
			}
			if (Character.isLetter(plate.charAt(i))) {
				contChar++;
			}
		}
		if (contNum > 4) {
			System.out.println("SORRY, plates has no more than 4 numbers. \n PLZ RE-enter the PLATE. ");
			return false;
		}
		if (contChar > 3) {
			System.out.println("SORRY, plates has no more than 3 letters. \n PLZ RE-enter the PLATE. ");
			return false;
		}
		return true;
	}

	public static Wheel createFrontWheels(){
		System.out.println("\nEnter brand of the FrontWheels:");
		String brandFW = InputScanner.inPut();
		System.out.println("\nEnter enter the diameter of the FrontWheels:");
		Wheel fWheels = new Wheel(brandFW, createWheelsDiameter());
		return fWheels;
	}

	public static Wheel createRearWheels(){
		System.out.println("\nEnter brand of the RearWheels:");
		String brandRW = InputScanner.inPut();
		System.out.println("\nEnter enter the diameter of the RearWheels:");
		Wheel rWheels = new Wheel(brandRW, createWheelsDiameter());
		return rWheels;
	}
	
	
	
	public static double createWheelsDiameter() {
		double diam;
		do {
			System.out.println("\nEnter the diameter: ");
			diam = Double.parseDouble(InputScanner.inPut());
		} while (!diameterValidation(diam));
		return diam;
	}
	
	public static boolean diameterValidation(double diam) {
		if (diam < 0.4 || diam > 4) {
			System.out.println("That's not a correct size.");
			return false;
		}
		return true;
	}
}
