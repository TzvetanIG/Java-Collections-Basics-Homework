import java.util.HashMap;
import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String text = input.nextLine().toLowerCase();

		String word = input.nextLine().toLowerCase();

		int counter  = 0;
		
		int position = -1;

		do {
			position = text.indexOf(word, position + 1);
			if (position != - 1) {
				counter++;
			}
		} while (position > -1);
		
		System.out.println(counter);
	}
}
