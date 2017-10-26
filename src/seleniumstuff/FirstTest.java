package seleniumstuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	
	private static WebDriver driver = null;
	private static String baseUrl = "https://www.google.hu";
	private static String expectedTitle = "Google";
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
			System.out.println("Test passed");
		else
			System.out.println("Test failed");
		driver.quit();
	}
}
