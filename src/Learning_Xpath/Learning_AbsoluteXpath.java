package Learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_AbsoluteXpath {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://kc-lp099/login.do");
			
			driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");
			driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("manager");
			driver.findElement(By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[5]/td/table/tbody/tr/td[3]")).click();
			
			Thread.sleep(2000);
			driver.quit();
	}

}
