package com.week3.assignment;

import java.util.Scanner;

public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DictMaker dict = new DictMaker();
		dict.initialise();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please Enter a String: ");
			String s = scanner.nextLine();
			int length = s.length();
			if (s.equals("exit"))
				break;
			for (int i = 0; i < length; i++) {
				if (s.charAt(i) != ' ') {
					int value = dict.getValue(s.charAt(i));
					System.out.print(Integer.toHexString(value));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		scanner.close();

	}

}
