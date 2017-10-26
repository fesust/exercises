package seleniumstuff;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieHandling {

	private static WebDriver driver = null;
	private static String baseUrl = "https://www.google.hu";
	
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		
		//setting
		Cookie cookie = new Cookie("key", "value");
		driver.manage().addCookie(cookie);
		
		//reading
		cookie = driver.manage().getCookieNamed("key");
		System.out.println(cookie.getValue());
		
		//deleting
		driver.manage().deleteCookieNamed("key");
		
		driver.quit();
	}
	
}
