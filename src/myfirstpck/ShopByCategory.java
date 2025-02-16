package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShopByCategory {
    
	WebDriver driver;
	
	
	@BeforeTest
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver115.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize(); 
	}
        
     @Test(priority=0) 
     
     public void openWebsite() {
        
        driver.get("https://www.amazon.in/");
  
        
        System.out.println("\n");
        System.out.println(driver.getTitle());
	}
     
   //Shop By category
  @Test(priority=0)
     public void shopbycategory() {
     	driver.findElement(By.id("nav-hamburger-menu")).click();
     	driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]")).click();
     	driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(3)")).click();
     }
  @AfterTest
  public void teardown() {
	  //driver.quit();
  }

}
