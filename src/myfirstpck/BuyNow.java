package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuyNow {
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize(); 
	}
	@Test
	public void buynow() {
	driver.get("https://www.amazon.in/NHR-Laser-Bullet-24-inch-Multicolor/dp/B08BHZ89JX/ref=sr_1_2?keywords=ak47&sr=8-2");
	driver.findElement(By.className("a-button-input")).click();
	 driver.findElement(By.id("shipToThisAddressButton")).click();
	}
}
