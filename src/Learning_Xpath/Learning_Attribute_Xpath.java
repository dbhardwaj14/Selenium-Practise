package Learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Attribute_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=3op3heatktedb");
		
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@class = 'textField'])[2]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id = 'loginButton']")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
