package com.week3.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DictMaker {

	private Map<Character, Integer> alphabetIndex = new HashMap<Character, Integer>();
	private static ArrayList<Integer> primes = new ArrayList<Integer>();

	static int MAX_SIZE = 1000005;

	private void SieveofEratosthenes() {
		boolean[] isPrime = new boolean[MAX_SIZE];
		for (int i = 0; i < MAX_SIZE; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i * i < MAX_SIZE; i++) {
			if (isPrime[i] == true) {
				for (int j = i * i; j < MAX_SIZE; j += i) {
					isPrime[j] = false;
				}
			}
		}
		primes.add(1);
		for (int p = 2; p < MAX_SIZE; p++) {
			if (isPrime[p] == true) {
				primes.add(p);
			}
		}
	}

	public void initialise() {
		SieveofEratosthenes();
		for (int i = 97; i <= 122; i++) {
			char alphabet = (char) (i);
			int value = primes.get(i - 97);
			alphabetIndex.put(alphabet, value);
		}
	}

	public void showDict() {
		for (Map.Entry<Character, Integer> entry : alphabetIndex.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public int getValue(char a) {
		return alphabetIndex.get(a);
	}
}
