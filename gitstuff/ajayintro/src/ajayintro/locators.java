package ajayintro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://one.forumias.com/login.php");
		driver.findElement(By.cssSelector("input.email_phone")).sendKeys("ajaykakunuri@gmail.com");
	    driver.findElement(By.xpath("form[@id=login_frm]/div/div2")).click();
	
	
		
		
		
				

	}
}

	