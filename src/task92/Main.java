package task92;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		System.out.println("The unique words in your text are: ");
		uniqueWords(text);
		sc.close();
	}

	public static void uniqueWords(String text) {
		String[] arr = text.toLowerCase().split("[ .,;!?]");
		Map<String, Integer> countWord = new HashMap<String, Integer>();
		for (String add : arr) {
			Integer count = countWord.get(add);
			if (count == null) {
				count = 0;
			}
			countWord.put(add, count + 1);
		}
		Set<String> key = countWord.keySet();
		for (String add : key) {
			int count = countWord.get(add);
			if (count == 1) {
				System.out.printf(" | "+ add+" | ");
			}
		}

	}

}