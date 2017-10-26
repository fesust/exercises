package seleniumstuff;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectFromDropDown {
	
	private static WebDriver driver = null;
	private static String baseUrl = "http://www.aliweb.com/";	
	
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		WebElement select = driver.findElement(By.xpath("//select[@name='hits']"));
		List<WebElement> options = select.findElements(By.tagName("option"));
		for (WebElement option : options) {
			System.out.println(option.getText());
			option.click();
			Thread.sleep(3000);
		}
		driver.quit();
	}
	
	

}
