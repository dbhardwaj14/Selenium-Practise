package Learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_Text_Contains {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/login.do;jsessionid=3op3heatktedb");
			
			driver.findElement(By.xpath("//label[contains(text(),'Keep me ')]")).click();
			
			Thread.sleep(2000);
			driver.quit();
	}

}
