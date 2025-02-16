
package myfirstpck;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PerformanceTest {
	static WebDriver driver;
	
    // Set up Chrome driver
	@Test
	public static void Performance(){
    	
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize(); 


        // Navigate to login page
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("nav-link-accountList")).click();

        // Set up loop for load testing
        int numberOfUsers = 4;
        
        for (int i = 0; i < numberOfUsers; i++) {
            
        	// Enter login credentials
        	 WebElement usernameField = driver.findElement(By.cssSelector("#ap_email"));
             usernameField.sendKeys("8220636712");
             WebElement continueButton = driver.findElement(By.id("continue"));
             continueButton.click();
             WebElement passwordField = driver.findElement(By.id("ap_password"));
             passwordField.sendKeys("1a1a1a1a");

            // Submit login form
            WebElement loginButton = driver.findElement(By.id("signInSubmit"));
            loginButton.click();
        }
	}
}
            
        /*    WebDriverWait wait1 = new WebDriverWait(driver, 10);
            WebElement element = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList-nav-line-1")));
            element.click();

            
            // Verify login success
            WebElement successMessage = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList-nav-line-1")));
            System.out.println("User " + (i+1) + " logged in successfully"+ successMessage);
            
            // Logout
            
            driver.findElement(By.id("nav-hamburger-menu")).click();
            driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a")).click();
        }
    }
}*/
            
/*
package myfirstpck;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class PerformanceTest {
    private WebDriver driver;
    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        driver = new ChromeDriver();
        new WebDriverWait(driver, 30);
    }

    @Test(invocationCount = 10, threadPoolSize=10)
    public void testPerformance() {
    	
        long startTime = System.currentTimeMillis();
        driver.get("https://www.amazon.com");
        long endTime = System.currentTimeMillis();
        System.out.println("Page load time: " + (endTime - startTime) + " milliseconds");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
} 
*/
