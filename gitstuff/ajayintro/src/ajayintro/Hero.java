package ajayintro;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hero {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> window=driver.getWindowHandles();
        Iterator<String> iterator=window.iterator();
        String parent=iterator.next();
        String child=iterator.next();
        driver.switchTo().window(child);
       System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
       driver.switchTo().window(parent);
       System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
       
       
       

	}

}
