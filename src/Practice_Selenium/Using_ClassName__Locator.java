package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ClassName__Locator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	 driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("books");
	 driver.findElement(By.className("search-box-text ui-autocomplete-input")).click();
	
}
}
