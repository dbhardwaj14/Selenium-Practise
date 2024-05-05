package learning_Webdriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetTitle_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.knowcross.com/");
		
		//method to fetch the title
		String title = driver.getTitle();
		System.out.println(title);

	}

}
