package Learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_Single_Select_DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement countrydD = driver.findElement(By.name("country"));
		Select sel = new Select(countrydD);
		
		sel.selectByIndex(76);
		Thread.sleep(2000);
		sel.selectByValue("BH");
		Thread.sleep(2000);
        sel.selectByVisibleText("Azerbaijan");
		Thread.sleep(2000);
        
        List<WebElement> alloptions = sel.getOptions();
        
        for (int i=1 ; i<=alloptions.size(); i++)
        {
        	sel.selectByIndex(i);
        	System.out.println(alloptions.get(i).getText());
        }
		
	}

}
