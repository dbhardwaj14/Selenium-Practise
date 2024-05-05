package Learning_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_Click_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://kc-lp099/login.do");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.id("loginButton"))).perform();
		
		
	}

}