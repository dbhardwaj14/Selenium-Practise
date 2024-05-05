package learning_Webdriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Get_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.knowcross.com/");
	}

}
