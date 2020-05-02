package com.week4.assignment;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class DictionaryInterface {

	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		Scanner scanner = new Scanner(System.in);
		String word = " ";
		String prevWord = " ";
		while (true) {
			System.out.println("Please Enter a WORD: ");
			prevWord = word;
			word = scanner.nextLine();
			if (word.equals("Y")) {
				SortedSet<String> list = new TreeSet<String>();
				while(true) {
					String meaning = scanner.nextLine();
					if(meaning.equals("")) {
						System.out.println("The word is " + prevWord);
						dict.addNew(prevWord, list);
						dict.showValue(prevWord);
						word = prevWord;
						break;
					}else {
						list.add(meaning);
					}
				}
			} else if (word.equals("GoodBye")) {
				System.out.println("Press Y to show meaning/ press anykey to exit");
				String s = scanner.nextLine();
				if (s.equals("Y"))
					dict.showValue(s);
				else {
					System.out.println("Thank you for using the app");
					break;
				}

			}else {
				dict.showValue(word);

			}
		}
		scanner.close();

	}

}
