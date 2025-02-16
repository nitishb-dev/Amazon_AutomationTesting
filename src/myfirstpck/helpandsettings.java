package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class helpandsettings {
	 WebDriver driver;
	 @BeforeTest
		public void setup(){
			
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
		}
	 
	 @Test(priority = 0)
	 public void validlogin() {
     	
         driver.findElement(By.id("nav-link-accountList")).click();
         driver.findElement(By.id("ap_email")).sendKeys("8220636712");
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("ap_password")).sendKeys("1a1a1a1a");
         driver.findElement(By.id("signInSubmit")).click();
         
         }
      
	 //Your Account
	 
	@Test(priority =1)
	public void YourAccount() {
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[28]")).click();
		driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(28)")).click();
	}
	
	
	//Customer Service
	
	@Test(priority =2)
	public void CustomerService() {
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[29]")).click();
		
	}
		
	//Sign Out
	
		@Test(priority=3)
		public void SignOut() {
			
			driver.findElement(By.id("nav-hamburger-menu")).click();
			driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a")).click();
		}
}
