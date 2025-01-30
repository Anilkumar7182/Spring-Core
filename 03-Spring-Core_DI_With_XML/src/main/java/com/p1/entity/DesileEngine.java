package com.p1.Entity;

public class DesileEngine implements Engine {

	@Override
	public int start() {
		System.out.println("desile engine is started");
		return 1;
	}

}