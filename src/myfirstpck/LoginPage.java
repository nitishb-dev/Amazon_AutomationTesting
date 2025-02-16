package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {                 //Main Class

    WebDriver driver;

    @BeforeTest                         //Code Setup
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("nav-link-accountList")).click();
    }

    @Test(priority = 0)                 // Valid Login
    public void testValidLogin() {
        WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys("8220636712");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("1a1a1a1a");
        WebElement loginButton = driver.findElement(By.id("signInSubmit"));
        loginButton.click();
        
        String currentUrl = "https://www.amazon.in/?ref_=nav_ya_signin";
        if(currentUrl=="https://www.amazon.in/?ref_=nav_ya_signin") {
        	System.out.println("LOGIN SUCCESSFULL");
        }
        else {
        	System.out.println("UNSUCCESSFULL LOGIN");
        }
    }
    
    @AfterTest
    public void teardown() {
 	   driver.quit();
    }

       
  /* @Test(priority = 1)
    public void testInvalidLogin() {
    	WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys("8220636712");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("abcd1234-");
        WebElement loginButton = driver.findElement(By.id("signInSubmit"));
        loginButton.click();

        WebElement wrongUsernameandPassword = driver.findElement(By.cssSelector("#auth-error-message-box > div"));
        Assert.assertNotNull(wrongUsernameandPassword);
        
        System.out.println("UNSUCCESSFULL LOGIN");
        }*/

   /*@Test(priority = 2)
    public void testEmptyUsername() {
    	WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys("");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        WebElement noUsernameMessage = driver.findElement(By.cssSelector("#auth-email-missing-alert > div > div"));
        Assert.assertNotNull(noUsernameMessage);
    }
   
    @Test(priority = 3)
    public void testEmptyPassword() {
    	WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys("1234567892");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("");
        WebElement loginButton = driver.findElement(By.id("signInSubmit"));
        loginButton.click();

        WebElement noPassword = driver.findElement(By.cssSelector("#auth-password-missing-alert > div > div"));
        Assert.assertNotNull(noPassword);
    }
    
   
    @Test(priority=4)
    public void testwrongusername() {
    	WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys("12334565711");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("abcd1234");
        WebElement loginButton = driver.findElement(By.id("signInSubmit"));
        loginButton.click();
        
        WebElement wrongUsername = driver.findElement(By.cssSelector("#auth-error-message-box"));
        Assert.assertNotNull(wrongUsername);
        
        System.out.println("UNSUCCESSFULL LOGIN");
    }
  
    @Test(priority=5)
    public void testwrongpassword() {
    	WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys("1234567890");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("abcd1235");
        WebElement loginButton = driver.findElement(By.id("signInSubmit"));
        loginButton.click();
        
        WebElement wrongPassword = driver.findElement(By.cssSelector("#auth-error-message-box"));
        Assert.assertNotNull(wrongPassword);
        
        System.out.println("UNSUCCESSFULL LOGIN");
    }
    */
   
}