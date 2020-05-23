package com.abinash.mobille.elements;

import org.springframework.stereotype.Component;

@Component
public class Screen {

	private int length;
	private int breadth;

//	public Screen(int length, int breadth) {
//		this.length = length;
//		this.breadth = breadth;
//
//	}

	public void status() {
		System.out.println("The screen is loaded");
	}

	@Override
	public String toString() {
		return "Screen [length=" + length + ", breadth=" + breadth + "]";
	}

}
