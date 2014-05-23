import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;



public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		
		ArrayList<Character> list1 = readListChar();
		ArrayList<Character> list2 = readListChar();
		
		list2.removeAll(list1);
		
		list1.addAll(list2);
		
		for (Character character : list1) {
			System.out.print(character + " ");
		}
	}


	public static ArrayList<Character> readListChar() {
		
		Scanner input = new Scanner(System.in);

		String[] chars = input.nextLine().split(" ");

		ArrayList<Character> list = new ArrayList<>();
		
		for (String ch : chars) {
			list.add(ch.charAt(0));
		}

		return list;
	}
}
