package ajayintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	System.out.println(driver.getTitle());
	)

	}

}

