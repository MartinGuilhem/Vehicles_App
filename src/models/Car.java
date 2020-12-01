package models;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
	
		//ATRIBUTES
		protected Wheel frontWheels; 
		protected Wheel rearWheels; 
		
		//CONSTRUCTOR
		public Car(String plate, String brand, String color) {
			super(plate, brand, color);
		}
		
		// GETTERS & SETTERS
		public Wheel getFrontWheels() {
			return frontWheels;
		}

		public void setFrontWheels(Wheel frontWheels) {
			this.frontWheels = frontWheels;
		}

		public Wheel getRearWheels() {
			return rearWheels;
		}

		public void setRearWheels(Wheel rearWheels) {
			this.rearWheels = rearWheels;
		}

		@Override
		public String toString() {
			return "Car [frontWheels=" + frontWheels + ", rearWheels=" + rearWheels + ", plate=" + plate + ", brand="
					+ brand + ", color=" + color + "]";
		}
		

}
