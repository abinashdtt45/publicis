package com.abinash.mobille.elements;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	private int noOfPixels;
	private int focalLength;

//	public Camera(int noOfPixels, int focalLength) {
//		this.noOfPixels = noOfPixels;
//		this.focalLength = focalLength;
//	}

	public void status() {
		System.out.println("The camera is loaded");
	}

	@Override
	public String toString() {
		return "Camera [noOfPixels=" + noOfPixels + ", focalLength=" + focalLength + "]";
	}

}
