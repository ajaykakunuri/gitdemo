package ajayintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsColumns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       /* driver.findElement(By.xpath("//table[@id=\"product\"]"));
       System.out.println(driver.findElements(By.cssSelector("table[name='courses'] tr")).size());
       System.out.println(driver.findElements(By.cssSelector("table[name='courses'] th")).size());
       System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());*/
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.table-display').scrollTop=2000");
       List<WebElement> values= driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
       int sum=0;
       for(int i=0;i<values.size();i++)
       {
    	 sum=sum+Integer.parseInt(values.get(i).getText());
       }
        
        
    System.out.println(sum);
	}

}
