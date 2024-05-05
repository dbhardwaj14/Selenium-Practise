package Learning_Synchronization;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.commandhandler.ExceptionHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_Explicit_Wait {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button")));
		driver.findElement(By.xpath("//button")).click();
				;
		
	}

}
