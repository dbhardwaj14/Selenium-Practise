package launching_Empty_Broswers;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEmpty_Edge_Broswer {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		new EdgeDriver();
	}

}
