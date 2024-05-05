package Learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_Operator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//span[contains(@id, 'nav-link') and contains(@class, 'nav-line-1')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'a-input-text') and (@type= 'email')] ")).sendKeys("7777777777");
		driver.findElement(By.xpath("//input[@class='a-button-input' or (@type='submit')] ")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
