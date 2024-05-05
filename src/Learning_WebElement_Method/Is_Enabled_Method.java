package Learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Is_Enabled_Method {

	public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://hk.knowcross.com/");
			
			WebElement SignIn = driver.findElement(By.id("buttonsign"));
			System.out.println(SignIn.isEnabled());
	}

}
