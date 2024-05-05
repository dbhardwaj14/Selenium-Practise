package Practice_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_KSV {
	
	public static void main (String[]arg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.knowcross.com/");
		
		//method to get Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Method to get current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//method to fetch the html source code
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		//method chaining 
				int height2 = driver.manage().window().getSize().getHeight();
				System.out.println(height2);
				
				int width2 = driver.manage().window().getSize().getWidth();
				System.out.println(width2);
				
				//method to fetch x_axis
				int x_axis = driver.manage().window().getPosition().getX();
				System.out.println(x_axis);
				
				//method to fetch y_axis
				int y_axis = driver.manage().window().getPosition().getY();
				System.out.println(y_axis);
				
				Thread.sleep(2000);
				
				//method to maximize browser
				driver.manage().window().fullscreen();
				
				int height3 = driver.manage().window().getSize().getHeight();
				System.out.println(height3);
				
				int width3 = driver.manage().window().getSize().getWidth();
				System.out.println(width3);
				
				//method to fetch x_axis
				int x_axis1 = driver.manage().window().getPosition().getX();
				System.out.println(x_axis1);
				
				//method to fetch y_axis
				int y_axis1 = driver.manage().window().getPosition().getY();
				System.out.println(y_axis1);
				
				Thread.sleep(2000);
				driver.quit();
	}
}
