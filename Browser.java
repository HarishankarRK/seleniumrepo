package week1;

public class Browser {
    
    // Method to launch the browser
    public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName;
    }

    // Method to load a URL
    public void loadUrl() {
        System.out.println("Application URL loaded successfully");
    }

    // Main method to create an object of Browser class and call its methods
    public static void main(String[] args) {
        Browser browser = new Browser();
        
        String browserName = browser.launchBrowser("Chrome");
        System.out.println("Launched: " + browserName);
        
        browser.loadUrl();
    }
}
