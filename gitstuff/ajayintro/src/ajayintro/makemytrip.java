package ajayintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {
	public static void main(String[] args) throws InterruptedException
	{
 System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.goindigo.in/");
 //driver.findElement(By.xpath("//a[@class=\"ancillaryService\"][1]")).click();
 //Thread.sleep(3000);
 //driver.findElement(By.xpath("//label[@for='oneWayTrip']")).click();
 //Thread.sleep(3000);
 //driver.findElement(By.xpath("div[id='orSrcModal'] div[class='autocomplete-results autocomplete-main station-result")).click();
 //Thread.sleep(3000);
 driver.findElement(By.xpath("//a[@data-target='#checkInTab']")).click();
 
		

 
 
 
 

 
 
 
 
 
 

}
}