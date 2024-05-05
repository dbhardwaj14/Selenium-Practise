package learning_Webdriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetPageSource {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://login.knowcross.com/");
	
	//method to fetch the html source code
	String sourcecode = driver.getPageSource();
	System.out.println(sourcecode);
	}

}
