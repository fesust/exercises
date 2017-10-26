package seleniumstuff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateElements {
	
	private static WebDriver driver = null;
	private static String baseUrl = "https://www.google.hu";	
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		List<WebElement> elements = driver.findElements(By.xpath("//input"));
		System.out.println(element);
		for (WebElement webElement : elements) {
			System.out.println(webElement);
		}
		driver.quit();
	}

}
