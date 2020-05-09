package com.week5.assignment;

class OwnTimer extends Thread {

	private Control c;

	OwnTimer(Control c) {
		this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			if (!c.check) {

				long start = System.currentTimeMillis();
				while (!c.check && System.currentTimeMillis() <= start + 10000)
					; // 10s wait or user enters some answer

				if (!c.check) { // User took longer than 10s and thus program terminates
					System.out.println("Times Up!!!");
					System.out.println("Thank you for playing the game");
					System.exit(0);
				}
			}
		}
	}
}

class Control {
	public volatile boolean check;
}