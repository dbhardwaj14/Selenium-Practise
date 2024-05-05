package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaning_Name_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window() .maximize();
			driver.get("https://demowebshop.tricentis.com/");
				
			driver.findElement(By.name("q")).sendKeys("mobile");
			
			Thread.sleep(2000);
			driver.quit();

	}

}
