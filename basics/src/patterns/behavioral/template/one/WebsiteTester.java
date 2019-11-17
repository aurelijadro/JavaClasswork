package patterns.behavioral.template.one;

public class WebsiteTester {
	public static void main (String[] args) {
		NewsPage news = new NewsPage();
		WelcomePage welcome = new WelcomePage();
		news.showPage();
		welcome.showPage();
	}
}
