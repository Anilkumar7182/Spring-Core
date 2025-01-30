package com.p1;

import com.p1.entity.Engine;

public class Car {
	
	private Engine eng;

	public Car(Engine eng) {
		super();
		this.eng = eng;
	}

	public Car() {
		super();
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	
	public void drive() {
		int status = eng.start();
		
		if(status <=1) {
			System.out.println("car drive ...");
		}else {
			System.out.println("car did not drive");
		}
	}

}
