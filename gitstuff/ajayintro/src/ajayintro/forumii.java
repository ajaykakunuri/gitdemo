package ajayintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forumii {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://academy.forumias.com/");
		 System.out.println(driver.findElement(By.xpath("//header/div/div/div[3]/div/a[1]")).getText());
		 
		 
		 
		 }

}
