package launching_Empty_Broswers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmpty_Chrome_Broswer {
	public static void main (String[]agrs)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
		
	}

}
