import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class _13_WebCrawler {

	public static void main(String[] args) throws Exception {

		String urlAdress = "http://bg.wikipedia.org";
		URL url = new URL(urlAdress);
		BufferedReader input = new BufferedReader(new InputStreamReader(
				url.openStream()));

		String inputLine;
		StringBuilder htmlCode = new StringBuilder();
		while ((inputLine = input.readLine()) != null) {
			htmlCode.append(inputLine+"\n");
		}
			
		
//		Pattern pattern = Pattern.compile("<\\s*a[\\s]+[^>]*href[ ]*=\"[^\"]+");
		Pattern pattern = Pattern.compile("<\\s*a[^>]*>");
		
		Matcher matcher = pattern.matcher(htmlCode.toString());
		
		while (matcher.find()) {
			
		    System.out.println(matcher.group());
		}

	}
	
}
