package task93;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 cards");
		String[] cards = new String[5];
		for (int i = 0; i < 5; i++) {
			cards[i] = (sc.nextLine());
		}
		cardsInfo(cards);
		sc.close();
	}

	public static void cardsInfo(String[] cards1) {
		Map<String, Integer> countCard = new HashMap<String, Integer>();
		for (String add : cards1) {
			Integer count = countCard.get(add);
			if (count == null) {
				count = 0;
			}
			countCard.put(add, count + 1);
		}
		Set<String> key = countCard.keySet();
		for (String add : key) {
			int count = countCard.get(add);
			if (count == 1) {
				System.out.println("You have just one [" + add + "]");
			}
			else if (count == 2) {
				System.out.println("You have a pair  [" + add + "]");
			}
			else if (count == 3) {
				System.out.println("You have three of a kind  [" + add + "]");
			}
			else if (count == 4) {
				System.out.println("You have four of a kind [" + add + "]");
			}
		}
	}
}
