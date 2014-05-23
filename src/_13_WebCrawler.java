
public class _13_WebCrawler {

	public static void main(String[] args) throws Exception {

		Crawler url = new Crawler("http://www.oracle.com/");
		url.crawl(2);
		
	}
	
}
