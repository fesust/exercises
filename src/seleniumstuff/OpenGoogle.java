package seleniumstuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		openGoogleWithFireFox();
		openGoogleWithChromeDriver();
	}
	
	private static void openGoogleWithFireFox() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.google.hu");
		Thread.sleep(3000);
		driver.quit();
	}
	
	private static void openGoogleWithChromeDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.hu");
		Thread.sleep(3000);
		driver.quit();
	}
	
	

	

}
