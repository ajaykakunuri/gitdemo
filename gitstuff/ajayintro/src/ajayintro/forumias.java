package ajayintro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forumias {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://one.forumias.com/login.php");
		driver.findElement(By.xpath("//*[@placeholder='Email/Phone']")).sendKeys("ajaykakunuri@gmail.com");
		driver.findElement(By.cssSelector("label[for='test2']")).click();
		driver.findElement(By.cssSelector("#password-field")).sendKeys("9246484967");
		driver.findElement((By.cssSelector("button[class*='btnRegister']"))).click();
		
		System.out.println(driver.findElement(By.xpath("//div[text()='alert alert-danger']")).getText()); 
	
		
		
		
		
		
		
		
		

	}

}
