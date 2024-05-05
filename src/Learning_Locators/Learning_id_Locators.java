package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Learning_id_Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window() .maximize();
		driver.get("https://demowebshop.tricentis.com/");
			
		By by = By.id("small-searchterms");
		WebElement searchTextField = driver.findElement(by);
		searchTextField.sendKeys("mobile");
		
		/*code optimization
		driver.findElement(By.id("small-searchterms")).sendKeys("books");*/
		
		Thread.sleep(2000);
		driver.quit();
	}

}
