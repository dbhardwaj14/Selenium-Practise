package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_Mouse_Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(10000);
		
		for(int i=1; i<=7; i++)
		{		
			String cap = "box"+i;
			String cou = "box10"+i;
		WebElement capital = driver.findElement(By.id(cap));
		WebElement country = driver.findElement(By.id(cou));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(capital, country).perform();	
		
		}
		for(int i=1; i<=7; i++)
		{		
			String cap = "box"+i;
		WebElement capital = driver.findElement(By.id(cap));
		WebElement capital_box = driver.findElement(By.id("capitals"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(capital, capital_box).perform();
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
