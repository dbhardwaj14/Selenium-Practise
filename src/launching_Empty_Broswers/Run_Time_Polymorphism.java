package launching_Empty_Broswers;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Run_Time_Polymorphism {


	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=null;
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("Print the Broswer");
		String Broswer = s.nextLine();
		if (Broswer.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/?gws_rd=ssl");
			
		}
		else if (Broswer.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/?gws_rd=ssl");
		}
		else if (Broswer.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.google.com/?gws_rd=ssl");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
