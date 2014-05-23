import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] numbersAsStrig = input.nextLine().split("[ ]+");

		int[] numbers = new int[numbersAsStrig.length];

		for (int i = 0; i < numbersAsStrig.length; i++) {
			numbers[i] = Integer.parseInt(numbersAsStrig[i]);
		}

		int startMaxSequence = 0;
		int lengthMaxSequence = 0;
		int endSequence = 0;
		int startSequence = 0;
		int lengthSequence = 0;

		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] < numbers[i + 1]) {

				System.out.print(numbers[i] + " ");
			} else {

				System.out.println(numbers[i]);
				endSequence = i;
				lengthSequence = endSequence - startSequence + 1;

				if (lengthSequence > lengthMaxSequence) {
					lengthMaxSequence = lengthSequence;
					startMaxSequence = startSequence;
				}
				
				startSequence = i + 1;
			}
		}

		int  maxI = numbers.length - 1;
		System.out.println(numbers[maxI]);
		endSequence = maxI;
		lengthSequence = endSequence - startSequence + 1;

		if (lengthSequence > lengthMaxSequence) {
			lengthMaxSequence = lengthSequence;
			startMaxSequence = startSequence;
		}

		System.out.print("Longest: ");

		for (int i = startMaxSequence; i < startMaxSequence + lengthMaxSequence; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
