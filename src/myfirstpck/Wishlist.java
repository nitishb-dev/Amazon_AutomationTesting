package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wishlist {
	WebDriver driver;
	@BeforeTest 
	public void setUp() {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
}

    //login
    @Test(priority=0)
	public void validlogin() {
    	
       driver.findElement(By.id("nav-link-accountList")).click();
       driver.findElement(By.id("ap_email")).sendKeys("8220636712");
       driver.findElement(By.id("continue")).click();
       driver.findElement(By.id("ap_password")).sendKeys("Nitish@22");
       driver.findElement(By.id("signInSubmit")).click();
     }
    

    
	@Test (priority=1)
	public void AddToWishlist() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.get("https://www.amazon.in/Apple-iPhone-13-Mini-256GB/dp/B09G9BJK4X/ref=sr_1_8?keywords=Iphone+13&qid=1680426517&sr=8-8");
		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
	}
	
	
	
    @AfterTest
    public void teardown() {
    //	driver.quit();
    }

}