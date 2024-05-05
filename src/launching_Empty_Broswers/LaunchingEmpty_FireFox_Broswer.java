package launching_Empty_Broswers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingEmpty_FireFox_Broswer {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		new FirefoxDriver();
	}

}
