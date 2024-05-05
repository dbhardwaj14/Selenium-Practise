package Learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hk.knowcross.com/");
		
		driver.findElement(By.id("customercode")).sendKeys("Kneu",Keys.TAB,"Eu1",Keys.TAB,"11",Keys.ENTER);
		Thread.sleep(25000);
		driver.findElement(By.xpath("(//a[@class='lineHeight1'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ng-binding'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-sm ng-binding ng-scope'])")).click();
		Thread.sleep(2000);
		WebElement GuestRoom = driver.findElement(By.xpath("(//input[@name = 'locationTypeRadio'])[1]"));
		System.out.println(GuestRoom.isSelected());
		WebElement PublicArea = driver.findElement(By.xpath("(//input[@name = 'locationTypeRadio'])[2]"));
		System.out.println(PublicArea.isSelected());
	}

}
