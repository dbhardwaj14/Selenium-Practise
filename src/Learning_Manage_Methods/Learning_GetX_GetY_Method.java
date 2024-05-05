package Learning_Manage_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetX_GetY_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		//method to fetch x_axis
		int x_axis = driver.manage().window().getPosition().getX();
		System.out.println(x_axis);
		
		//method to fetch y_axis
		int y_axis = driver.manage().window().getPosition().getY();
		System.out.println(y_axis);
		
		Thread.sleep(5000);
		driver.quit();
		}

}
