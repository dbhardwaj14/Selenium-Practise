package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_HK {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hk.knowcross.com/");
		
		driver.findElement(By.id("customercode")).sendKeys("Kneu");
		driver.findElement(By.id("username")).sendKeys("eu1");
		driver.findElement(By.id("password")).sendKeys("11");
		driver.findElement(By.id("buttonsign")).click();
		
	}

}
