package Learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
	WebElement searchTF = driver.findElement(By.id("small-searchterms"));

	Point location = searchTF.getLocation();
	System.out.println(location);
	System.out.println(location.getX());
	System.out.println(location.getY());
	}

}
