package Learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Dynamic_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text() = '✕']")).click();
		driver.findElement(By.xpath("//input[@name= 'q']")).sendKeys("MOTOROLA g54 5G (Mint Green, 128 GB)  (8 GB RAM)");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		String S = driver.findElement(By.xpath("//div[text()='MOTOROLA g54 5G (Mint Green, 128 GB)']/../../..//div[contains(@class,'jeq')]")).getText();
		System.out.println(S);
	}

}
