package Learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Attribute_Contains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input [contains(@class,'search-box-text')]")).sendKeys("mobile");
		driver.findElement(By.xpath("(//input [contains(@class,'button-1')])[1]")).click();
		
		Thread.sleep(2000);
		driver.quit();


	}

}
