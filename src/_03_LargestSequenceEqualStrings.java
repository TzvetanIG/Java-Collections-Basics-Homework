import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;

import org.omg.CORBA.Object;

public class _03_LargestSequenceEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] strings = input.nextLine().split(" ");

		TreeMap<String, Integer> sequences = new TreeMap<>();

		for (int i = 0; i < strings.length; i++) {
			if (sequences.containsKey(strings[i])) {
				sequences.put(strings[i], sequences.get(strings[i]) + 1);
			} else {
				sequences.put(strings[i], 1);
			}
		}

		Set<String> keys = sequences.keySet();

		String wordOfLargestSequence = "";
		int maxNumber = 0;

		for (String key : keys) {
			if (sequences.get(key) > maxNumber) {
				maxNumber = sequences.get(key);
				wordOfLargestSequence = key.toString();
			}
		}
		
		for (int i = 0; i < maxNumber; i++) {
			System.out.print(wordOfLargestSequence  + " ");
		}
	}
}
