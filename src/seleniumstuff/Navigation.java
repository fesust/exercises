package seleniumstuff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
	
	private static WebDriver driver = null;
	private static String baseUrl = "https://www.google.hu";
	
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().to("https://hu.wikipedia.org/wiki/Kezd%C5%91lap");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.quit();
	}
}
