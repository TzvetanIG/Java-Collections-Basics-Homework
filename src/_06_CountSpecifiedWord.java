import java.util.HashMap;
import java.util.Scanner;


public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine().toLowerCase();
		
		String word  = input.nextLine().toLowerCase();

		String[] splitText = text.split("[\\W\\d]+");
		
		HashMap<String, Integer> wordsHashMap = new HashMap<>(); 
		
		for (String key : splitText) {
			
			if (wordsHashMap.containsKey(key)) {
				wordsHashMap.put(word, wordsHashMap.get(key) + 1);
			} else {
				wordsHashMap.put(key, 1);
			}
		}
		
		
		System.out.println(wordsHashMap.get(word) == null ? 0: wordsHashMap.get(word));
	}

}
