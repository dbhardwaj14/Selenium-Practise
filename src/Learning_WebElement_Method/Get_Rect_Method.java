package Learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Rect_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
	WebElement searchTF = driver.findElement(By.id("small-searchterms"));

	Rectangle rect = searchTF.getRect();
	System.out.println(rect);
	System.out.println(rect.getHeight());
	System.out.println(rect.getWidth());
	System.out.println(rect.getX());
	System.out.println(rect.getY());
	}

}
