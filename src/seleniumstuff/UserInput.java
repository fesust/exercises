package seleniumstuff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserInput {
	
	private static WebDriver driver = null;
	private static String baseUrl = "https://www.google.hu";	
	
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		element.clear();
		element.sendKeys("Selenium testing");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
