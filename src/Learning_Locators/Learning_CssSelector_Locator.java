package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_CssSelector_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://kc-lp099/login.do");
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[onclick='login(document.forms[0]); return false']")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}
}
