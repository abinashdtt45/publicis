package com.abinash.mobille.elements;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
	private int power;
	private boolean bass;
	private int volLevel;

//	public Speaker(int power, boolean bass) {
//		this.power = power;
//		this.bass = bass;
//		this.volLevel = 5;
//	}

	public void setVolLevel(int volLevel) {
		this.volLevel = volLevel;
	}

	public void status() {
		System.out.println("The speaker is loaded");
	}

	@Override
	public String toString() {
		return "Speaker [power=" + power + ", bass=" + bass + ", volLevel=" + volLevel + "]";
	}

}
