package Auto_Suggestion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_FindElements_Method 
{
	//int count;
	public static void main(String[] args) throws InterruptedException 
	{

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			WebElement op = driver.findElement(By.name("q"));
			op.sendKeys("Selenium");
			Thread.sleep(2000);
			
			List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='lnnVSe']"));
			Thread.sleep(2000);
			
			for (WebElement suggestion : suggestions)
			{
//				String S1 = suggestion.getText();
//				if(S1.contains("selenium uses"));
//				{
//					//System.out.println(S1);
//				System.out.println("Thanks");
//				}	
				WebElement S2 = op.sendKeys(Keys.DOWN);//simulate visual movement
				String S3 = S2.getText();
			        if ( S3.equals( "selenium uses" ) );
			        {
			        	System.out.println(S3);	
			    }

			}
	}
}
