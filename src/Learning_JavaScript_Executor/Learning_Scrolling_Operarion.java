package Learning_JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Scrolling_Operarion {

	public static void main(String[] args) throws InterruptedException {	
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0, 200)");
		// Thread.sleep(2000);
		
		/*js.executeScript("window.scrollTo(0, 300)");
		Thread.sleep(2000);
		
		/*js.executeScript("window.scrollBy(0, -300)");
		Thread.sleep(2000);  */
		
		WebElement addToCart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)", addToCart);
		
	}
}
		
		
		