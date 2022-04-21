package ajayintro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iterator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> iterator=window.iterator();
		String parent=iterator.next();
		String child=iterator.next();
		driver.switchTo().window(child);
		driver.findElement(By.cssSelector(".im-para.red"));
		String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailid);
		
		
		
		

	}

}
