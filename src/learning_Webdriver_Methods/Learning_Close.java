package learning_Webdriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(5000);
		
		//method to close the browser
		driver.close();
	}

}
