package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Partial_Link_Text_Locator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://kc-lp099/login.do");
		
	 driver.findElement(By.partialLinkText("License")).click();
	 Thread.sleep(5000);
	 driver.quit();
}
}
