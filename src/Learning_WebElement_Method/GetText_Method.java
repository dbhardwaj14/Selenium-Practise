package Learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetText_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://hk.knowcross.com/");
		
		driver.findElement(By.id("customercode")).sendKeys("Kneu",Keys.TAB,"Eu1",Keys.TAB,"11",Keys.ENTER);
		Thread.sleep(25000);
		String text = driver.findElement(By.id("headerScreenName")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.quit();
}
}