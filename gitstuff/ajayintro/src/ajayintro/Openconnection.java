package ajayintro;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openconnection {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.bigbasket.com/");
       List <WebElement> link=driver.findElements(By.linkText("a"));
       System.out.println(link.size());
       for(int i=0;i<link.size();i++)
       {
    	   WebElement abc=link.get(i);
    	   String url=abc.getAttribute("href");
    	   URL xyz=new URL(url);
    	   HttpURLConnection conn=(HttpURLConnection) xyz.openConnection();
    	   conn.connect();
    	   int rescode=conn.getResponseCode();
    	   if(rescode>=400)
    		 System.out.println(url+" is broken link"+rescode);
    	   else
    		   System.out.println(url+"valid links"+rescode);
    	   
    	  
    	   
       }
      ;
       

	}

}
