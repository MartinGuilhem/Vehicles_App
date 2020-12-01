package view;


import controller.CarController;

public class Menu {

	public static void viewMainMenu() {
		System.out.println("\n Welcome to Vehicles Application!");
		System.out.println("\n\n Please select the vehicle you want to create.");
		System.out.println("\n Do you want to create a Car or a Bike?");
		System.out.println("\nSELECT : Car = 1 / Bike = 2");
		
		switch(carOrBike()) {
		case 1: 
			CarController.crateCar();
			break;
		case 2:
			//BikeController.createBike();
			break;
		default:
				System.out.println("\nThank you!");
		}
	}
	
	public static int carOrBike() {
		int cob = 0;

		do {
			cob = Integer.parseInt(InputScanner.inPut());
			if (cob < 1 || cob > 2) {
				System.out.println("\nThe selected option is not valid. Please select Again:");
			}
		} while (cob < 1 || cob > 2);
		return cob;
	}

	/*
	public static void createCar() {
		
		System.out.println("Please, enter the BRAND of the car: ");
		car1.set_brand(sc.nextLine());
		System.out.println("Please, enter the COLOR of the car: ");
		car1.set_color(sc.nextLine());

		System.out.println(car1.get_carData());

		System.out.println("\nPlease, enter the brand of the FRONT-WHEELS of the car: ");
		frntWheelBrand = sc.nextLine();

		do {
			System.out.println("\nPlease, enter the diameter of the FRONT-WHEELS of the car: ");
			frntWheelDiam = Double.parseDouble(sc.nextLine());

			if (frntWheelDiam < 0.4 || frntWheelDiam > 4) {
				System.out.println("That is not a correct size..");
			}
		} while (frntWheelDiam < 0.4 || frntWheelDiam > 4);

		System.out.println("\nPlease, enter the brand of the REAR-WHEELS of the car: ");
		bckWheelBrand = sc.nextLine();

		do {
			System.out.println("\nPlease, enter the diameter of the REAR-WHEELS of the car: ");
			bckWheelDiam = Double.parseDouble(sc.nextLine());

			if (bckWheelDiam < 0.4 || bckWheelDiam > 4) {
				System.out.println("That is not a correct size..");
			}
		} while (bckWheelDiam < 0.4 || bckWheelDiam > 4);

		Wheel Fw1 = new Wheel(frntWheelBrand, frntWheelDiam);
		Wheel Rw1 = new Wheel(bckWheelBrand, bckWheelDiam);

		
		
	}
*/
	

}
