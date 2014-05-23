import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08_ExtractEmails {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String text = input.nextLine();
		
		Pattern pattern = Pattern.compile("[\\][\\w\\d._]+@[\\w\\d_.]+");
		
		Matcher matcher = pattern.matcher(text);
		
		while (matcher.find()) {
			
		    System.out.println(matcher.group());
		}
	}
}
