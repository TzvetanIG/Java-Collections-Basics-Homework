import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;




public class _12_CardsFrequencies {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		String[] cards = input.nextLine().toUpperCase().split("[♣♦♥♠ ]+");
		
		HashMap<String, Integer> cardsHashMap = new HashMap<>();
		
		for (String card: cards) {
			if (cardsHashMap.containsKey(card)) {
				cardsHashMap.put(card, cardsHashMap.get(card) + 1);
			} else {
				cardsHashMap.put(card, 1);
			}
		}

		LinkedHashSet<String> keys = new LinkedHashSet<String>() ;
		
		
		for (String card: cards) {
			keys.add(card);
		}

			
		for (String key : keys) {
				System.out.printf("%s - > %.2f %% %n", key, (double)cardsHashMap.get(key)/cards.length*100.00);
				
				
		}
		
	}

}
