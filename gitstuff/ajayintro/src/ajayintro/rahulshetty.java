package ajayintro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahulshetty {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//Thread.sleep(5000);
		//driver.switchTo().window(driver.getWindowHandle());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='username'] ")).sendKeys("rahulshettyacademy");

		driver.findElement(By.xpath("//input[@id='password'] ")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		driver.findElement(By.xpath("//button[@id='okayBtn']"));
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='iphone X']"));
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Samsung Note 8']"));
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Nokia Edge']"));
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Blackberry']"));
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
		
		
		

	}

}
