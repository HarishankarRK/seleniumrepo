package week1;

public class Edgebrowser {
	public static void main(String[] args) {
        Browser browser = new Browser();
        
        String browserName = browser.launchBrowser("Edge");
        System.out.println("Launched: " + browserName);
        
        browser.loadUrl();
    }
}


