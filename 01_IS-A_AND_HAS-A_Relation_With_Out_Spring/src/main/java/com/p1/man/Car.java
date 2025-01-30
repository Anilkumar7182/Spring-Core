package com.p1.man;

public class Car {
	
	private Engine eng;
	
	
	public Car() {
		super();
	}

	public Car(Engine eng) {
		super();
		this.eng = eng;
	}
	
	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public void drive() {
		int status = eng.Start();
		if(status <=1) {
		System.out.println("Car start drive now");
	}else {
		System.out.println("Car not start some problem...");
	}
	
}
}