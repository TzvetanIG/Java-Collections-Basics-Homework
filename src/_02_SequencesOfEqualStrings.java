import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] strings = input.nextLine().split(" ");
		
		for (int i = 0; i < strings.length - 1; i++) {
			
			System.out.print(strings[i]);
			
			if (strings[i].equals(strings[i+1])) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
		
		System.out.print(strings[strings.length -1]);

	}
}
