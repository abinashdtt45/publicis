package com.abinash.mobille.elements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	Screen screen;
	@Autowired
	Camera camera;
	@Autowired
	Speaker speaker;

//	public Mobile() {
//		screen.status();
//		camera.status();
//		speaker.status();
//
//		System.out.println("The mobile is setup");
//
//	}

	public void status() {
		System.out.println("The mobile is now working");
	}

}
