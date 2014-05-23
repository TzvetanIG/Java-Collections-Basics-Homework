import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
	private String adress;
	ArrayList<Crawler> urls = new ArrayList<>();

	public Crawler(String adress) {
		this.adress = adress;
	}

	public void crawl(int levelsNumber) throws IOException {

		if (levelsNumber < 1) {
			return;
		}

		BufferedReader input = null;
		
		try {
			URL url = new URL(this.adress);

			Pattern pattern = Pattern.compile("<\\s*a\\s+.*href\\s*=\"[^\"]+");

			StringBuilder htmlCode = new StringBuilder();

			input = new BufferedReader(new InputStreamReader(
					url.openStream()));

			String inputLine;

			while ((inputLine = input.readLine()) != null) {
				htmlCode.append(inputLine + "\n");
			}

			Matcher matcher = pattern.matcher(htmlCode.toString());
			
			int count = 0;

			while (matcher.find()) {
				count++;
				System.out.println(count+". " + matcher.group().split("href[\\s]*=\\s*\"")[1]);
				Crawler newUrl = new Crawler(matcher.group());
				urls.add(newUrl);
				newUrl.crawl(levelsNumber - 1);
			}
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			return;
		} finally {
			// Pattern pattern = Pattern.compile("<\\s*a[^>]*>");

			if (input != null)
				input.close();
		}

	}
}
