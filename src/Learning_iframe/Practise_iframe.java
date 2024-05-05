package Learning_iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_iframe {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.id("datepicker")).sendKeys("15/08/2024");
		
		String date1 = driver.findElement(By.id("datepicker")).getText()
		WebElement date = sdriver.getAttribute(date1);
		System.out.println(date);
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
