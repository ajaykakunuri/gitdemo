package ajayintro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fcae {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.id("email")).sendKeys("ajaykakunuri@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("028376477");
		 driver.findElement(By.name("login")).click();
		System.out.println( driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());
		
		
		 
		 
	}

}
