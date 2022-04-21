package ajayintro;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().fullscreen();
		 String[] itemsneeded= {"Onion","Carrot - Orange"};
		 driver.get("https://www.bigbasket.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@data-sectioninteractionplower='{\"EventName\":\"ItemClicked\",\"ScreenInPageContext\":\"sbc\"}'][normalize-space()='Fruits & Vegetables']")).click();
		 Thread.sleep(3000);
		 additems(driver,itemsneeded);
	}
	public static void additems(WebDriver driver,String[] itemsneeded)
	
	{
		int j=0;
		List<WebElement>products=driver.findElements(By.xpath("//div[@qa='product_name']"));
		for(int i=0;i<products.size();i++)
		
		{
			
			String[] name=products.get(i).getText().split("-");
			System.out.println(name);
			
			List<String> itemsNeededList=Arrays.asList(itemsneeded);
			System.out.println(itemsNeededList);
			if(itemsNeededList.contains(products.get(i).getText()))
			{
				System.out.println(itemsNeededList);
				driver.findElements(By.xpath("//button[@ng-click='vm.addToBasket(vm.selectedProduct);']")).get(i).click();
				if(j==itemsneeded.length)
				{
					break;
					
				}
				
				
			}
			
			
		}
		 
		 

	
	}

}
