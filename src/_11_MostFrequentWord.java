import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class _11_MostFrequentWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] words = input.nextLine().toLowerCase().split("[\\W\\d]+");
		
		TreeMap<String, Integer> wordsHashMap = new TreeMap<>();
		
		for (String word: words) {
			if (wordsHashMap.containsKey(word)) {
				wordsHashMap.put(word, wordsHashMap.get(word) + 1);
			} else {
				wordsHashMap.put(word, 1);
			}
		}

		Set<String> keys = wordsHashMap.keySet();
		
		int maxNumber = 0;

		for (String key : keys) {
			if (wordsHashMap.get(key) > maxNumber) {
				maxNumber = wordsHashMap.get(key);
			}
		}
		
		for (String key : keys) {
			if (maxNumber == wordsHashMap.get(key)) {
				System.out.printf("%s - > %d times%n", key, maxNumber);
			}
		}

		
	}

}
