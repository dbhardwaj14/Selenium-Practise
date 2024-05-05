package Learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear_Method 
{
	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://hk.knowcross.com/");
		
		WebElement customercode = driver.findElement(By.id("customercode"));
		customercode.sendKeys("Kneu");
		customercode.clear();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
