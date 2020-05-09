package com.week5.assignment;

import java.util.Scanner;



public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		QuestionList list = new QuestionList();
		list.generateQuestionList();
		int i = 0;
		int score = 0;
		Control c = new Control();
		OwnTimer t = new OwnTimer(c);
		t.setDaemon(true); // CustomThread made Daemon
		t.start();
		while (i < 6) {
			Question q = list.getQuestionObject(i);
			System.out.println(q.getQuestion());
			System.out.println("The options are: ");
			System.out.println("1. " + q.getOpt1());
			System.out.println("2. " + q.getOpt2());
			System.out.println("3. " + q.getOpt3());
			System.out.println("4. " + q.getOpt4());
			System.out.println("Your Answer: you just have 10 sec!!!!! \n");
			c.check = false;
			String answer = input.nextLine();
			c.check = true;
			if (list.checkQuestion(i, answer)) {
				System.out.println("Congratulations you have the correct answer");
				score++;
				System.out.println("Your score is " + score + "\n");
			} else {
				System.out.println("Sorry Wrong answer, The correct answer is " + q.getCorrectOption());
				System.out.println("Your score is " + score + "\n");
			}
			i++;
		}
		System.out.println("Thank you for playing the game");
		System.exit(0);
		input.close();

	}

}
