	package Learning_Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Window_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://kc-lp099/login.do");
			
			driver.findElement(By.partialLinkText("License")).click();		
			System.out.println(driver.getTitle());
			
			String parentWindowID = driver.getWindowHandle();
			Set<String> allWindowID = driver.getWindowHandles();
			System.out.println(parentWindowID);
			System.out.println(allWindowID);
			
			allWindowID.remove(parentWindowID);
			for (String WindowID : allWindowID)
			{
				driver.switchTo().window(WindowID);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
			driver.close();
			}
			driver.switchTo().window(parentWindowID);
			driver.close();
		
	}

	}

