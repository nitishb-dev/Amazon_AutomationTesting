package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchProduct {
	  WebDriver driver;
	
	@BeforeTest 
	public void setUp() {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }
	
	 @Test(priority=0)
        public void ValidProductSearch(){
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
          driver.findElement(By.id("nav-search-submit-button")).click();
          driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Blue/dp/B09G9BL5CP/ref=sr_1_5?keywords=Iphone+13&qid=1679558050&sr=8-5");
    }
	  
	/* @Test(priority=1)
	  public void InvalidProductSearch() {
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poda venna");
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  
		  WebElement noResultsMessage = driver.findElement(By.className("a-row"));
	        Assert.assertNotNull(noResultsMessage);
	  }*/
	  
	  @AfterTest
	    public void teardown() {
		  driver.quit();
	  }
}