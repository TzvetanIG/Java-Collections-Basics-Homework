import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String[] words = input.nextLine().toLowerCase().split("[\\W\\d]+");
		
		TreeSet<String> uniqueWords = new TreeSet<>(Arrays.asList(words));
		
		for (String word : uniqueWords) {
			System.out.print(word  + " ");
		}

	}

}
