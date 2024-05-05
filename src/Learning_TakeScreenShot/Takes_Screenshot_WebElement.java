package Learning_TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takes_Screenshot_WebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://kc-lp099/login.do");
		
		WebElement loginButton = driver.findElement(By.xpath("(//tbody)[3]"));
		File source = loginButton.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/webElementSS.jpeg");
		FileHandler.copy(source, destination);
	}

}
