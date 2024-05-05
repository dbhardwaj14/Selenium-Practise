package Learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_MultiSelect_Droodown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		
		WebElement monthDD = driver.findElement(By.name("Month"));
		Select sel = new Select (monthDD);
		
		sel.selectByIndex(10);
		Thread.sleep(2000);
		sel.selectByValue("Ma");
		Thread.sleep(2000);
        sel.selectByVisibleText("July");
		Thread.sleep(2000);
		
		sel.deselectByIndex(7);
		Thread.sleep(2000);
		sel.deselectByValue("Oct");
		Thread.sleep(2000);
        sel.deselectByVisibleText("March");
		Thread.sleep(2000);
		
		//sel.deselectAll();
		
		/*List<WebElement> allSelected = sel.getAllSelectedOptions();
		for(WebElement webElement : allSelected)
		{
			System.out.println(webElement.getText());
			}*/
        List<WebElement> alloptions = sel.getOptions();
		Thread.sleep(2000);

        for (int i=1 ; i<alloptions.size(); i++)
        {
        	sel.selectByIndex(i);
        	System.out.println(alloptions.get(i).getText());
        }
		}
			
			
		
		
	

}
