package Practice_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Hiddden_Division_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://kc-lp099/tasks/otasklist.do");
		
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='content tasks_selected selected']")).click();
		//driver.findElement(By.xpath("(//td[@class='listtblcell'])[3]")).click();
		driver.findElement(By.xpath("//td [@class='listtblcell' and (@id='taskNameCell1')]")).click();
	}

}
