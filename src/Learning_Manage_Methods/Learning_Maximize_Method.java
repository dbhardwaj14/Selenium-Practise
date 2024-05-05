package Learning_Manage_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Maximize_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		//method to maximize browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	} 

}
