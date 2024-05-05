package Learning_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Parent_Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Calendar = driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
		js.executeScript("arguments[0].scrollIntoView(true)", Calendar);
		driver.findElement(By.className("https://www.hyrtutorials.com/p/calendar-practice.html")).click();
	}

}
