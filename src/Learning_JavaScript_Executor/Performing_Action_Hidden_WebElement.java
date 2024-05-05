package Learning_JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performing_Action_Hidden_WebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"))); //Scroll upto Element Displayed Example 

		
		driver.findElement(By.id("hide-textbox")).click(); //hiding the textbox field
		js.executeScript("arguments[0].value='aman'", driver.findElement(By.id("displayed-text"))); //Entering the value in hidden text box.

		
		
	}

}
