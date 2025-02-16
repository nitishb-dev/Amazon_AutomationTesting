package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class AddToCart {
	
	WebDriver driver;
	
	@BeforeTest
	 public void openWebsite() {
		    System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        System.out.println("\n");
	        System.out.println(driver.getTitle());
		}
	public void validlogin() {
    	
	       driver.findElement(By.id("nav-link-accountList")).click();
	       driver.findElement(By.id("ap_email")).sendKeys("8220636712");
	       driver.findElement(By.id("continue")).click();
	       driver.findElement(By.id("ap_password")).sendKeys("1a1a1a1a");
	       driver.findElement(By.id("signInSubmit")).click();
	     }
	public void searchproduct() {
        
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.get("https://www.amazon.in/Apple-iPhone-13-Mini-256GB/dp/B09G9BJK4X/ref=sr_1_8?keywords=Iphone+13&qid=1680426517&sr=8-8");

    }
	public void addtocart() {    
        
		driver.findElement(By.id("add-to-cart-button")).click();
    	driver.findElement(By.className("a-button-text")).click();
        
    }   
}
