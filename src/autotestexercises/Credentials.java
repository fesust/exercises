package autotestexercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 * @author Tamas_Fesus
 * Write the following test cases:
 * Blank username / Blank password - error for both fields - DONE
 * Blank username / Entered password - error for username - DONE
 * Entered username / Blank password - error for password - DONE
 * Invalid username / Entered password - Wrong username or password error - DONE
 * Valid username / Invalid password - Wrong username or password error - DONE
 * Valid username / Valid password - successful login - DONE
 */

public class Credentials {

	private static String validUser = "testuser777";
	private static String validPass = "JUnitSelenium999";
	private String baseUrl = "https://accounts.freemail.hu/oauth/login";
	private WebDriver driver = null;

	@Before
	public void initPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(5, TimeUnit.SECONDS)
					.pollingEvery(1, TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(@class, 'login-box')]"))));
		} catch (Exception e) {
			System.err.println(">>>>>>>Exception while waiting for the login box: " + e.toString());
			System.err.println(e.getStackTrace().toString());
		}
		driver.manage().window().maximize();
	}

	@Test
	@Ignore
	public void blankUsernameBlankPasswordShowsErrorForBothFields() {
		WebElement loginButton = driver.findElement(By.name("loginBtn"));
		loginButton.click();
		WebElement usernameError = driver.findElement(By.xpath("//input[@id='username']/following-sibling::*[1][name()='div']/p"));
		assertEquals("Missing username error should be visible", "Nem adtál meg felhasználónevet", usernameError.getText());
		WebElement passwordError = driver.findElement(By.xpath("//input[@id='password']/following-sibling::*[1][name()='div']/p"));
		assertEquals("Missing username error should be visible", "Nem adtál meg jelszót", passwordError.getText());
	}

	@Test
	@Ignore
	public void loginOK() {
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));

		usernameField.sendKeys(validUser);
		passwordField.sendKeys(validPass);

		WebElement loginButton = driver.findElement(By.name("loginBtn"));
		loginButton.click();
		try {	
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(5, TimeUnit.SECONDS)
					.pollingEvery(1, TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dropdownMenu-1"))));
		} catch (Exception e) {
			System.err.println(">>>>>>>Exception while waiting for the login box: " + e.toString());
			System.err.println(e.getStackTrace().toString());
		}
		WebElement usernameDropdown = driver.findElement(By.id("dropdownMenu-1"));
		assertTrue("messageListContainer does not displayed", usernameDropdown.isDisplayed());
	}

	@Test
	@Ignore
	public void BlankUser(){

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys(validPass);

		WebElement loginButton = driver.findElement(By.name("loginBtn"));
		loginButton.click();

		WebElement usernameError = driver.findElement(By.xpath("//input[@id='username']/following-sibling::*[1][name()='div']/p"));
		assertEquals("Missing username error should be visible", "Nem adtál meg felhasználónevet", usernameError.getText());

	}

	@Test
	@Ignore
	public void BlankPass(){

		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys(validUser);

		WebElement loginButton = driver.findElement(By.name("loginBtn"));
		loginButton.click();

		WebElement passwordError = driver.findElement(By.xpath("//input[@id='password']/following-sibling::*[1][name()='div']/p"));
		assertEquals("Missing username error should be visible", "Nem adtál meg jelszót", passwordError.getText());

	}
	
	@Test
	@Ignore
	public void WrongUser(){
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));

		usernameField.sendKeys("asdf");
		passwordField.sendKeys(validPass);

		WebElement loginButton = driver.findElement(By.name("loginBtn"));
		loginButton.click();
		
		WebElement usernameError = driver.findElement(By.xpath("//p[@class='error-msg bold']"));
		assertEquals("Missing username error should be visible", "Hibás felhasználónév vagy jelszó!", usernameError.getText());
	}

	@Test
	public void WrongPass(){
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));

		usernameField.sendKeys(validUser);
		passwordField.sendKeys("asdf");

		WebElement loginButton = driver.findElement(By.name("loginBtn"));
		loginButton.click();
		
		WebElement passError = driver.findElement(By.xpath("//p[@class='error-msg bold']"));
		assertEquals("Missing username error should be visible", "Hibás felhasználónév vagy jelszó!", passError.getText());
	}
	

	@After
	public void closeBrowser() {
		driver.close();
		driver.quit();
		driver = null;
	}

}