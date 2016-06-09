package task91;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		String[] words = { "sun", "Chelsea", "Chelsea", "Terry", "loser", "winner", "great", "fine", "yes", "great", "red",
				"great", "great", "java4win", "java4win", "c#isbad", "fly", "grocery" };

		Map<String, Integer> wordsCount = new HashMap<String, Integer>();

		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(word, count + 1);
		}

		Set<String> wordKeys = wordsCount.keySet();

		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			System.out.println(word + " -> " + count + " times");
		}
		

	}
}