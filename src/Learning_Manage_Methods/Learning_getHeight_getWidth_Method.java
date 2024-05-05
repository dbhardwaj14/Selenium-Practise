package Learning_Manage_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Window;

public class Learning_getHeight_getWidth_Method {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		//method to fetch the height
		Options option = driver.manage();
		Window window = option.window();
		Dimension size = window.getSize();
		int height = size.getHeight();
		System.out.println(height);
		
		//method to fetch width
		int width = size.getWidth();
		System.out.println(width);
		
		//method chaining 
		int height2 = driver.manage().window().getSize().getHeight();
		System.out.println(height2);
		
		int width2 = driver.manage().window().getSize().getWidth();
		System.out.println(width2);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
