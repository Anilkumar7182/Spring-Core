package com.p1.entity;

public class PatrolEngine implements Engine {

	@Override
	public int start() {
		System.out.println("Patrol ingine is started ");
		return 1;
	}

}
