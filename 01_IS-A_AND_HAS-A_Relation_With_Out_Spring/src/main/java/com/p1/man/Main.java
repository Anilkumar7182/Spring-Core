package com.p1.man;

import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
	//	Car car = new Car(new PatrolEngine());
		
	//	Car car = new Car(new DesileEngine());
		
		Car car = new Car();
		
	//	car.setEng(new PatrolEngine());
		
		car.setEng(new DesileEngine());
		
		car.drive();
	}

}
