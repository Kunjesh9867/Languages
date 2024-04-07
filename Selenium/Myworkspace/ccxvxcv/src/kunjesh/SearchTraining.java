package kunjesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SearchTraining {
    
	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  
	  
	  public void tearDown() {
	    driver.quit();
	  }

	  
	  public void kunjesh() throws InterruptedException {
	    driver.get("https://kunjeshramani.netlify.app/");
	    driver.manage().window().setSize(new Dimension(1052, 724));
	    js.executeScript("window.scrollTo(0,778.9091186523438)");
	    js.executeScript("window.scrollTo(0,171.63636779785156)");
	    driver.findElement(By.linkText("Certificates")).click();
	    driver.findElement(By.linkText("Projects")).click();
	    driver.findElement(By.linkText("Contact Me")).click();
	    driver.findElement(By.name("Name")).click();
	    driver.findElement(By.name("Name")).sendKeys("Selenium");
	    driver.findElement(By.name("Email")).click();
	    driver.findElement(By.name("Email")).sendKeys("kk@gmail.com");
	    driver.findElement(By.name("Message")).click();
	    driver.findElement(By.name("Message")).sendKeys("Hello");
	    driver.findElement(By.name("submit-to-google-sheet")).click();
	    driver.findElement(By.id("button")).click();
	    
	    Thread.sleep(3000);
	  }
	

    // Launching the Chrome Browser
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunje\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // Initialize the WebDriver
		
        driver.get("https://www.simplilearn.com/");
    }

    // Searching selenium training and clicking on it
    public void search() throws InterruptedException {
        WebElement searchInput = driver.findElement(By.className("form-control.input-search-field"));
        CharSequence[] searchText = { "Selenium" };
        searchInput.sendKeys(searchText);
        
//        Thread.sleep(3000);
        
        driver.findElement(By.className("search_icon")).click();
        
//        Thread.sleep(3000);
        
        System.out.println("The page title is: " + driver.getTitle());
    }


//    // Close the browser
//    public void closeBrowser() {
//        driver.quit();
//    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Kunjesh");
        SearchTraining obj = new SearchTraining();
//        obj.launchBrowser();
//        obj.search();
//        obj.closeBrowser();
    	
        for(int i=0; i<5;i++) {
        	obj.setUp();
            
            obj.kunjesh();
        }
//        obj.tearDown();	
    	
    }
}
