package Learning_iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("D:\\Selenium-Java\\iframe.html");
		
		//switch to frame by index
        //driver.switchTo().frame(0);
        
      // switch to frame by id/name
      //  driver.switchTo().frame("frame1");
        
        //switch to frame by webelement
        
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='frame1']")));
        
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='frame1']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.name("q")).sendKeys("mobile");
        
        driver.switchTo().defaultContent();//use to go back to main webpage
        
        driver.findElement(By.linkText("Google")).click();
 
	}
	}


