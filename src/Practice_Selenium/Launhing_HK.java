package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launhing_HK  {
	
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://hk.knowcross.com/");
		
		//method to fetch the title
				String title = driver.getTitle();
				System.out.println(title);
		
		//method to fetch url
		String url = driver.getCurrentUrl();
		System.out.println(url);	
		
		/*method to fetch the html source code
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);*/
		
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
		driver.manage().window().maximize();
		
		//method chaining 
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
				
				
				driver.findElement(By.partialLinkText("UNIFOCUS SUPPORT")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	}

