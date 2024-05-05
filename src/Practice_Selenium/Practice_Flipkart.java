package Practice_Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@name= 'q']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		
		allWindowID.remove(parentWindowID);
		for (String WindowID : allWindowID)
		{
			driver.switchTo().window(WindowID);
			System.out.println(driver.getTitle());
			String price = driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]")).getText();
			String percentage = driver.findElement(By.xpath("//div[@class=\"_3Ay6Sb _31Dcoz\"]")).getText();
			System.out.println(price);
			System.out.println(percentage);

		}

}
}