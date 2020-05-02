package com.week4.assignment;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
public class Dictionary {
	private Map<String, SortedSet<String>> dictionary = new TreeMap<String, SortedSet<String>>();

	public void addNew(String s, SortedSet<String> list) {
		if (dictionary.containsKey(s)) {
			for (String mean : list) {
				dictionary.get(s).add(mean);
			}
		} else {
			dictionary.put(s, list);
		}
	}

	public void showValue(String s) {
		if (dictionary.containsKey(s)) {
			for (String meaning : dictionary.get(s)) {
				System.out.println(meaning);
			}
			System.out.println("Press Y to add more meaning");
		} else {
			System.out.println("Press Y to add meaning");
		}
	}

}
